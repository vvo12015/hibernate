package ua.goit.java;

import ua.goit.java.controllers.DishController;
import ua.goit.java.controllers.EmployeeController;
import ua.goit.java.controllers.OrderController;

public class Main {
    private EmployeeController employeeController;
    private DishController dishController;
    private OrderController orderController;

    public void setOrderController(OrderController orderController) {
        this.orderController = orderController;
    }

    public void start() {
        orderController.printAllOrder();
        System.out.println();
        employeeController.getAllEmployees().forEach(System.out::println);
    }

    public void setEmployeeController(EmployeeController employeeController) {
        this.employeeController = employeeController;
    }

    public void setDishController(DishController dishController) {
        this.dishController = dishController;
    }
}
