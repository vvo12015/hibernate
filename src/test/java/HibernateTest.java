import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.goit.java.Position;
import ua.goit.java.controllers.*;
import ua.goit.java.model.*;

import java.util.ArrayList;
import java.util.List;

public class HibernateTest {

    private static final String WAITER_FOR_ORDER = "waiterForCreate";
    private static final String WAITER_NAME = "waiterTest";
    private static final String PHONE_NUMBER = "777-77-777";
    private static final float SALARY = 7700.0F;
    private static final int TABLE_NUMBER = 777;
    private static final String DISH_NAME = "dishForRemove";
    private static final String PHOTO_FOR_TEST = "photoForTest";
    private static final float WEIGHT = 300F;
    private static final float PRICE = 15F;
    private static final String EMPLOYEE_NAME = "testEmployee";
    private static final float EMPLOYEE_SALARY = 1111F;
    private static final String MENU_NAME = "testMenu";
    private static final String INGREDIENT_NAME = "testIngredient";
    private static final int COUNT_INGREDIENT = 10;
    public static final String DISH_FOR_ORDER = "dishForOrder";

    private ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml",
            "hibernate-context.xml");
    private DishController dishController = (DishController) applicationContext.getBean("dishController");
    private EmployeeController employeeController = (EmployeeController) applicationContext.getBean("employeeController");
    private OrderController orderController = (OrderController) applicationContext.getBean("orderController");
    private MenuController menuController = (MenuController) applicationContext.getBean("menuController");
    private IngredientController ingredientController = (IngredientController)
                                                applicationContext.getBean("ingredientController");
    private StockController stockController = (StockController)
            applicationContext.getBean("stockController");

    @Test
    public void testOrderLoad(){

        Dish dish = new Dish(DishCategory.MAIN, DISH_FOR_ORDER, WEIGHT, PRICE, PHOTO_FOR_TEST);
        dishController.save(dish);

        List<Dish> dishes = new ArrayList<>();
        dishes.add(dish);

        Waiter waiter = new Waiter(WAITER_NAME, WAITER_NAME, PHONE_NUMBER, SALARY);
        employeeController.save(waiter);

        Orders order = new Orders(waiter, dishes, TABLE_NUMBER);

        orderController.save(order);

        Long orderId = orderController.getByNameWaiter(waiter).get(0).getId();

        Orders orderTest = orderController.getById(orderId);

        System.out.println(orderTest);

        Assert.assertEquals("load dish by id", orderTest.getWaiter(), waiter);

        dishController.delete(dish);
        employeeController.delete(waiter);
        orderController.delete(order);

    }


    @Test
    public void testDishRemove(){

        Dish dish = new Dish(DishCategory.MAIN, DISH_NAME, 300F, 15F, PHOTO_FOR_TEST);

        dishController.save(dish);

        dishController.delete(dish);
    }

    @Test
    public void testDishLoad(){

        String dishName = DISH_NAME;

        Dish dish = new Dish(DishCategory.MAIN, dishName, WEIGHT, PRICE, PHOTO_FOR_TEST);

        dishController.save(dish);

        Long dishId = dishController.getDishByName(dishName).getId();

        Dish dishTest = dishController.getById(dishId);

        System.out.println(dishTest);

        Assert.assertEquals("load dish by id", dishTest.getName(), dishName);

        dishController.delete(dishTest);
    }

     @Test
    public void testWaiterLoad(){

         String waiterNameExcepted = WAITER_NAME;

         employeeController.save(new Waiter(waiterNameExcepted, waiterNameExcepted,
                 PHONE_NUMBER, SALARY));

         Long employeeId = employeeController.getEmployeeByName(waiterNameExcepted).getId();

         Waiter employee = employeeController.getWaiterById(employeeId);

         System.out.println(employee);

         Assert.assertEquals("load employee by id", employee.getName(), waiterNameExcepted);

         employeeController.delete(employee);
    }



    @Test
    public void testEmployeeLoad(){

        String employeeNameExcepted = EMPLOYEE_NAME;

        employeeController.save(new Employee(employeeNameExcepted, employeeNameExcepted,
                PHONE_NUMBER, Position.COOK, EMPLOYEE_SALARY));

        Long employeeId = employeeController.getEmployeeByName(employeeNameExcepted).getId();

        Employee employee = employeeController.getById(employeeId);

        System.out.println(employee);

        Assert.assertEquals("load employee by id", employee.getName(), employeeNameExcepted);

        employeeController.delete(employee);
    }

    @Test
    public void testMenuLoad(){

        String menuNameExcepted = MENU_NAME;

        Menu menu = new Menu(MENU_NAME, dishController.getAll(), PHOTO_FOR_TEST);

        menuController.save(menu);

        Long menuId = menuController.getMenuByName(menuNameExcepted).getId();

        menu = menuController.getById(menuId);

        System.out.println(menu);

        Assert.assertEquals("load menu by id", menu.getName(), menuNameExcepted);

        menuController.delete(menu);
    }

    @Test
    public void testIngredientLoad(){
        String ingredientNameExcepted = INGREDIENT_NAME;

        Ingredient ingredient = new Ingredient(ingredientNameExcepted, ingredientNameExcepted);

        ingredientController.save(ingredient);

        Long ingredientId = ingredientController.getIngredientByName(ingredientNameExcepted).getId();

        ingredient = ingredientController.getById(ingredientId);

        System.out.println(ingredient);

        Assert.assertEquals("load ingredient by id", ingredient.getName(), ingredientNameExcepted);

        ingredientController.delete(ingredient);

    }

    @Test
    public void testStockLoad(){

        String stockNameExcepted = INGREDIENT_NAME;

        Stock stock = new Stock(ingredientController.getIngredientByName(stockNameExcepted), COUNT_INGREDIENT);

        stockController.save(stock);

        Long stockId = stockController
                .getStockByNameIngredient(ingredientController.getIngredientByName(stockNameExcepted))
                .get(0)
                .getId();

        Ingredient ingredient = stockController.getById(stockId).getIngredient();

        System.out.println(stock);

        Assert.assertEquals("load stock by id", ingredient.getName(), stockNameExcepted);

        stockController.delete(stock);

    }



    @Test
    public void init(){
        dishController.init();
        employeeController.init();
        orderController.init();
        menuController.init();
        ingredientController.init();
        stockController.init();
    }

    @Test
    public void cleanAll(){
        orderController.deleteAll();
        menuController.deleteAll();
        employeeController.deleteAll();
        dishController.deleteAll();
    }


}
