package ua.goit.java.controllers;

import org.springframework.transaction.annotation.Transactional;
import ua.goit.java.dao.OrderDao;
import ua.goit.java.model.Orders;
import ua.goit.java.model.Waiter;

import java.util.ArrayList;
import java.util.List;

public class OrderController extends AbstractController<Orders, OrderDao>{

    private EmployeeController employeeController;
    private DishController dishController;

    @Transactional
    public void printAllOrder(){
        dao.findAll().forEach(System.out::println);
    }

    public void setEmployeeController(EmployeeController employeeController) {
        this.employeeController = employeeController;
    }

    public void setDishController(DishController dishController) {
        this.dishController = dishController;
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

        Waiter bob = (Waiter) employeeController.getEmployeeByName("Bob");
        Waiter john = (Waiter) employeeController.getEmployeeByName("John");
        Waiter mary = (Waiter) employeeController.getEmployeeByName("Mary");

        dao.save(new Orders(bob, dishController.createDishes(dishes1), 1));
        dao.save(new Orders(john, dishController.createDishes(dishes2), 2));
        dao.save(new Orders(mary, dishController.createDishes(dishes3), 3));
    }

    public List<Orders> getByNameWaiter(Waiter waiter) {
        return dao.findByWaiterName(waiter);
    }
}
