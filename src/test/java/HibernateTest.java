import org.hibernate.SessionFactory;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.goit.java.Main;
import ua.goit.java.controllers.DishController;
import ua.goit.java.controllers.EmployeeController;
import ua.goit.java.controllers.OrderController;
import ua.goit.java.model.*;

import java.util.ArrayList;
import java.util.List;

public class HibernateTest {

    private ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml",
            "hibernate-context.xml");
    private DishController dishController = (DishController) applicationContext.getBean("dishController");
    private EmployeeController employeeController = (EmployeeController) applicationContext.getBean("employeeController");
    private OrderController orderController = (OrderController) applicationContext.getBean("orderController");
    private SessionFactory sessionFactory = (SessionFactory) applicationContext.getBean("sessionFactory");

    @Test
    public void mainTest(){
        Main main = applicationContext.getBean(Main.class);
        main.start();
    }

    @Test
    public void employeeFindByName(){
        Employee employee = employeeController.getEmployeeByName("test");

        Assert.assertEquals("equals name from db", employee.getSurName(), "test");
    }

    @Test
    public void dishFindByName(){

        Dish dish = dishController.getDishByName("test");

        Assert.assertEquals("equals photo from db", dish.getPhoto(), "photo");
    }

    @Test
    public void orderControllerTest(){

        employeeController.createEmployee(new Waiter("testWaiter", "test", "111-111-111", 1000F));
        dishController.save(new Dish(DishCategory.MAIN, "testDish", 1F, 1F, "dishPhoto"));

        List<String> dishesName = new ArrayList<>();
        dishesName.add("testDish");

        orderController.createOrder("testWaiter", dishesName, 999);

        Orders order = new Orders();
        List<Orders> orderses = orderController.getByNameWaiter("testWaiter");
        order = orderses.get(0);

        Assert.assertEquals("check to be order of test", order.getTableNumber(), 999);

        orderController.removeOrder(order);
        dishController.removeDish(dishController.getDishByName("testDish"));
        employeeController.removeEmployees(employeeController.getEmployeeByName("testWaiter"));
    }

    @Test(expected = Exception.class)
    public void exceptionOrderControllerTest(){

        employeeController.createEmployee(new Waiter("testWaiter", "test", "111-111-111", 1000F));
        dishController.save(new Dish(DishCategory.MAIN, "testDish", 1F, 1F, "dishPhoto"));

        List<String> dishesName = new ArrayList<>();
        dishesName.add("testDish");

        orderController.createOrder("testWaiter", dishesName, 999);

        Orders order = new Orders();
        List<Orders> orderses = orderController.getByNameWaiter("testWaiter");
        order = orderses.get(0);

        Assert.assertEquals("check to be order of test", order.getTableNumber(), 999);

        orderController.removeOrder(order);
        dishController.removeDish(dishController.getDishByName("testDish"));
        employeeController.removeEmployees(employeeController.getEmployeeByName("testWaiter"));

        order = orderController.getByNameWaiter("testWaiter").get(0);
    }



}
