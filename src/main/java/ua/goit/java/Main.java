package ua.goit.java;

import ua.goit.java.controllers.Controller;
import ua.goit.java.controllers.EmployeeController;
import ua.goit.java.controllers.OrderController;

public class Main {
    private EmployeeController employeeController;
    private Controller dishController;
    private OrderController orderController;

    public void setOrderController(OrderController orderController) {
        this.orderController = orderController;
    }

    public void start() {
        orderController.printAllOrder();
        System.out.println();
        employeeController.getAll().forEach(System.out::println);
    }

    public void setEmployeeController(EmployeeController employeeController) {
        this.employeeController = employeeController;
    }

    public void setDishController(Controller dishController) {
        this.dishController = dishController;
    }
}
