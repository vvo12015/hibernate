package ua.goit.java.restaurant.service;

import org.springframework.transaction.annotation.Transactional;
import ua.goit.java.restaurant.dao.OrderDao;
import ua.goit.java.restaurant.model.Orders;
import ua.goit.java.restaurant.model.Waiter;

import java.util.ArrayList;
import java.util.List;

public class OrderService extends AbstractService<Orders, OrderDao> {

    private EmployeeService employeeService;
    private DishService dishService;

    @Transactional
    public void printAllOrder(){
        dao.findAll().forEach(System.out::println);
    }

    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public void setDishService(DishService dishService) {
        this.dishService = dishService;
    }

    public void init() {

        List<String> dishes1 = new ArrayList<>();

        dishes1.add("Potato");
        dishes1.add("Plov");

        List<String> dishes2 = new ArrayList<>();

        dishes1.add("Potato");
        dishes1.add("Salad");

        List<String> dishes3 = new ArrayList<>();

        dishes1.add("Salad");
        dishes1.add("Potato");

        Waiter bob = (Waiter) employeeService.getEmployeeByName("Bob");
        Waiter john = (Waiter) employeeService.getEmployeeByName("John");
        Waiter mary = (Waiter) employeeService.getEmployeeByName("Mary");

        dao.save(new Orders(bob, dishService.createDishes(dishes1), 1));
        dao.save(new Orders(john, dishService.createDishes(dishes2), 2));
        dao.save(new Orders(mary, dishService.createDishes(dishes3), 3));
    }

    public List<Orders> getByNameWaiter(Waiter waiter) {
        return dao.findByWaiterName(waiter);
    }
}
