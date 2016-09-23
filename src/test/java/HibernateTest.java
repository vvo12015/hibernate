import org.hibernate.SessionFactory;
import org.junit.Assert;
import org.junit.Before;
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

    private static final String DISH_NAME = "testDish2";
    private static final String DISH_PHOTO = "dishPhoto2";
    private static final int TABLE_NUMBER = 888;

    private static final String WAITER_NAME = "testWaiter2";
    private static final String WAITER_PHONE = "222-222-222";
    private static final String SUR_NAME = "test2";
    private static final Float WAITER_SALARY = 2000F;

    private ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml",
            "hibernate-context.xml");
    private DishController dishController = (DishController) applicationContext.getBean("dishController");
    private EmployeeController employeeController = (EmployeeController) applicationContext.getBean("employeeController");
    private OrderController orderController = (OrderController) applicationContext.getBean("orderController");
    private SessionFactory sessionFactory = (SessionFactory) applicationContext.getBean("sessionFactory");
    private List<String> dishesName;
    private Orders order;
    private boolean reInt = true;

    @Before
    public void setUp(){
        if (reInt){
            orderController.removeAllOrders();
            dishController.removeAllDishes();
            employeeController.removeAllEmployees();

            employeeController.initEmployees();
            dishController.initDishes();
            orderController.initOrders();
            order = mySetUp();
        }
    }

    @Test
    public void mainTest(){
        Main main = applicationContext.getBean(Main.class);
        main.start();
    }

    @Test
    public void employeeFindByName(){
        Employee employee = employeeController.getEmployeeByName(WAITER_NAME);

        Assert.assertEquals("equals name from db", employee.getSurName(), SUR_NAME);
    }

    @Test
    public void dishFindByName(){

        Dish dish = dishController.getDishByName(DISH_NAME);

        Assert.assertEquals("equals photo from db", dish.getPhoto(), DISH_PHOTO);
    }

    @Test
    public void orderControllerTest(){

        Assert.assertEquals("check to be order of test", order.getTableNumber(), TABLE_NUMBER);

        mySetDown();
    }

    @Test(expected = Exception.class)
    public void exceptionOrderControllerTest(){

        Assert.assertEquals("check to be order of test", order.getTableNumber(), TABLE_NUMBER);

        mySetDown();

        order = orderController.getByNameWaiter((Waiter) employeeController.getEmployeeByName(WAITER_NAME)).get(0);
    }

    private void mySetDown() {
        orderController.removeAllOrders();
        dishController.removeAllDishes();
        employeeController.removeAllEmployees();
    }

    private Orders mySetUp() {
        employeeController.createEmployee(new Waiter(WAITER_NAME, SUR_NAME, WAITER_PHONE, WAITER_SALARY));
        dishController.save(new Dish(DishCategory.MAIN, DISH_NAME, 2F, 2F, DISH_PHOTO));

        dishesName = new ArrayList<>();
        dishesName.add(DISH_NAME);

        orderController.createOrder((Waiter) employeeController.getEmployeeByName(WAITER_NAME),
                                    dishesName, TABLE_NUMBER);

        order = new Orders();
        List<Orders> orders = orderController.getByNameWaiter((Waiter) employeeController.getEmployeeByName(WAITER_NAME));
        order = orders.get(0);
        return order;
    }

    @Test
    public void testRemoveOrder(){

        String waiterName = "waiterForCreate";

        Waiter waiter = new Waiter(waiterName, waiterName, "777-77-777", 7700.0F);

        employeeController.createEmployee(waiter);

        dishesName = new ArrayList<>();
        dishesName.add(DISH_NAME);

        int tableNumber = 777;

        orderController.createOrder(waiter, dishesName, tableNumber);

        waiter = (Waiter) employeeController.getEmployeeByName(waiterName);

        Orders order = orderController.getByNameWaiter(waiter).get(0);

        System.out.println(order);

        orderController.removeOrder(order);
    }
}
