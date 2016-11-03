import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.goit.java.restaurant.Position;
import ua.goit.java.restaurant.model.*;
import ua.goit.java.restaurant.service.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
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
    private DishService dishService = (DishService) applicationContext.getBean("dishService");
    private EmployeeService employeeService = (EmployeeService) applicationContext.getBean("employeeService");
    private OrderService orderService = (OrderService) applicationContext.getBean("orderService");
    private MenuService menuService = (MenuService) applicationContext.getBean("menuService");
    private IngredientService ingredientService = (IngredientService)
                                                applicationContext.getBean("ingredientService");
    private StockService stockService = (StockService)
            applicationContext.getBean("stockService");

    @Test
    public void test1OrderLoad(){

        Ingredient ingredient = new Ingredient("test", "t");
        ingredientService.save(ingredient);

        List<Ingredient> listIngredients = new ArrayList<>();
        listIngredients.add(ingredientService.getIngredientByName("test"));

        Dish dish = new Dish(listIngredients, DishCategory.MAIN, DISH_FOR_ORDER, WEIGHT, PRICE, PHOTO_FOR_TEST);
        dishService.save(dish);

        List<Dish> dishes = new ArrayList<>();
        dishes.add(dish);

        Waiter waiter = new Waiter(WAITER_NAME, WAITER_NAME, PHONE_NUMBER, SALARY);
        employeeService.save(waiter);

        Orders order = new Orders(waiter, dishes, TABLE_NUMBER);

        orderService.save(order);

        Long orderId = orderService.getByNameWaiter(waiter).get(0).getId();

        Orders orderTest = orderService.getById(orderId);

        System.out.println(orderTest);

        Assert.assertEquals("load dish by id", orderTest.getWaiter(), waiter);

        orderService.delete(order);
        dishService.delete(dish);
        ingredientService.delete(ingredient);
        employeeService.delete(waiter);
    }


    @Test
    public void test2DishRemove(){

        Ingredient ingredient = new Ingredient("test", "t");
        ingredientService.save(ingredient);

        List<Ingredient> listIngredients = new ArrayList<>();
        listIngredients.add(ingredientService.getIngredientByName("test"));

        Dish dish = new Dish(listIngredients, DishCategory.MAIN, DISH_FOR_ORDER, WEIGHT, PRICE, PHOTO_FOR_TEST);

        dishService.save(dish);

        dishService.delete(dish);
    }

    @Test
    public void test3DishLoad(){

        String dishName = DISH_NAME;

        Ingredient ingredient = new Ingredient("test", "t");
        ingredientService.save(ingredient);

        List<Ingredient> listIngredients = new ArrayList<>();
        listIngredients.add(ingredientService.getIngredientByName("test"));

        Dish dish = new Dish(listIngredients, DishCategory.MAIN, dishName, WEIGHT, PRICE, PHOTO_FOR_TEST);

        dishService.save(dish);

        Long dishId = dishService.getDishByName(dishName).getId();

        Dish dishTest = dishService.getById(dishId);

        System.out.println(dishTest);

        Assert.assertEquals("load dish by id", dishTest.getName(), dishName);

        dishService.delete(dishTest);
    }

     @Test
    public void test4WaiterLoad(){

         String waiterNameExcepted = WAITER_NAME;

         employeeService.save(new Waiter(waiterNameExcepted, waiterNameExcepted,
                 PHONE_NUMBER, SALARY));

         Long employeeId = employeeService.getEmployeeByName(waiterNameExcepted).getId();

         Waiter employee = employeeService.getWaiterById(employeeId);

         System.out.println(employee);

         Assert.assertEquals("load employee by id", employee.getName(), waiterNameExcepted);

         employeeService.delete((Employee) employee);
    }



    @Test
    public void test5EmployeeLoad(){

        String employeeNameExcepted = EMPLOYEE_NAME;

        employeeService.save(new Employee(employeeNameExcepted, employeeNameExcepted,
                PHONE_NUMBER, Position.COOK, EMPLOYEE_SALARY));

        Long employeeId = employeeService.getEmployeeByName(employeeNameExcepted).getId();

        Employee employee = employeeService.getById(employeeId);

        System.out.println(employee);

        Assert.assertEquals("load employee by id", employee.getName(), employeeNameExcepted);

        employeeService.delete(employee);
    }

    @Test
    public void test6MenuLoad(){

        String menuNameExcepted = MENU_NAME;

        Menu menu = new Menu(MENU_NAME, dishService.getAll(), PHOTO_FOR_TEST);

        menuService.save(menu);

        Long menuId = menuService.getMenuByName(menuNameExcepted).getId();

        menu = menuService.getById(menuId);

        System.out.println("This is test menu" + menu);

        Assert.assertEquals("load menu by id", menu.getName(), menuNameExcepted);

        menuService.delete(menu);
    }

    @Test
    public void test7IngredientLoad(){
        String ingredientNameExcepted = INGREDIENT_NAME;

        Ingredient ingredient = new Ingredient(ingredientNameExcepted, ingredientNameExcepted);

        ingredientService.save(ingredient);

        Long ingredientId = ingredientService.getIngredientByName(ingredientNameExcepted).getId();

        ingredient = ingredientService.getById(ingredientId);

        System.out.println(ingredient);

        Assert.assertEquals("load ingredient by id", ingredient.getName(), ingredientNameExcepted);

        ingredientService.delete(ingredient);

    }

    @Test
    public void test8StockLoad(){

        String ingredientNameExcepted = INGREDIENT_NAME;

        Ingredient ingredient = new Ingredient(ingredientNameExcepted, ingredientNameExcepted);

        ingredientService.save(ingredient);

        String stockNameExcepted = INGREDIENT_NAME;

        Stock stock = new Stock(ingredientService.getIngredientByName(stockNameExcepted), COUNT_INGREDIENT);

        stockService.save(stock);

        Long stockId = stockService
                .getStockByNameIngredient(ingredientService.getIngredientByName(stockNameExcepted))
                .get(0)
                .getId();

        ingredient = stockService.getById(stockId).getIngredient();

        System.out.println(stock);

        Assert.assertEquals("load stock by id", ingredient.getName(), stockNameExcepted);

        stockService.delete(stock);

        ingredientService.delete(ingredient);
    }

    @Test
    public void test9Init(){
        orderService.deleteAll();
        employeeService.deleteAll();
        menuService.deleteAll();
        stockService.deleteAll();
        dishService.deleteAll();
        ingredientService.deleteAll();
        ingredientService.init();
        dishService.init();
        employeeService.init();
        orderService.init();
        menuService.init();
        stockService.init();
    }

}
