package ua.goit.java.restaurant;

import ua.goit.java.restaurant.service.Service;
import ua.goit.java.restaurant.service.EmployeeService;
import ua.goit.java.restaurant.service.OrderService;

public class Main {
    private EmployeeService employeeService;
    private Service dishService;
    private OrderService orderService;

    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    public void start() {
        orderService.printAllOrder();
        System.out.println("-----");
        employeeService.getAll().forEach(System.out::println);
    }

    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public void setDishService(Service dishService) {
        this.dishService = dishService;
    }
}