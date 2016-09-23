package ua.goit.java.controllers;

import org.springframework.transaction.annotation.Transactional;
import ua.goit.java.dao.DishDao;
import ua.goit.java.dao.EmployeeDAO;
import ua.goit.java.dao.OrderDao;
import ua.goit.java.model.Dish;
import ua.goit.java.model.Orders;
import ua.goit.java.model.Waiter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class OrderController {

    private EmployeeDAO employeeDao;
    private DishDao dishDao;
    private OrderDao orderDao;

    @Transactional
    public void createOrder(Waiter waiter, List<String> dishes, int tableNumber){
        Orders order = new Orders();
        order.setWaiter(waiter);
        order.setDishes(createDishes(dishes));
        order.setTableNumber(tableNumber);
        order.setOrderDate(new Date());

        orderDao.save(order);
    }

    @Transactional
    public List<Orders> getAllOrders(){
        return orderDao.findAll();
    }

    @Transactional
    public void printAllOrder(){
        orderDao.findAll().forEach(System.out::println);
    }

    private List<Dish> createDishes(List<String> dishes) {

        List<Dish> result = dishes.stream().map(dishName -> dishDao.findByName(dishName)).collect(Collectors.toList());

        return result;
    }

    public void setEmployeeDao(EmployeeDAO employeeDao) {
        this.employeeDao = employeeDao;
    }

    public void setDishDao(DishDao dishDao) {
        this.dishDao = dishDao;
    }

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    @Transactional
    public void removeAllOrders() {
        orderDao.removeAll();
    }

    public void initOrders() {

        List<String> dishes1 = new ArrayList<>();

        dishes1.add("Potato");
        dishes1.add("Plov");

        List<String> dishes2 = new ArrayList<>();

        dishes1.add("Potato");
        dishes1.add("Salad");

        List<String> dishes3 = new ArrayList<>();

        dishes1.add("Salad");
        dishes1.add("Potato");

        Waiter bob = (Waiter) employeeDao.findByName("Bob");
        Waiter john = (Waiter) employeeDao.findByName("John");
        Waiter mary = (Waiter) employeeDao.findByName("Mary");

        createOrder(bob, dishes1, 1);
        createOrder(john, dishes2, 2);
        createOrder(mary, dishes3, 1);
    }

    public List<Orders> getByNameWaiter(Waiter waiter) {
        return orderDao.findByWaiterName(waiter);
    }

    public void removeOrder(Orders order) {
        orderDao.remove(order);
    }
}
