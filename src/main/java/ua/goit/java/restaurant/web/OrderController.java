package ua.goit.java.restaurant.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ua.goit.java.restaurant.model.OrderForController;
import ua.goit.java.restaurant.service.DishService;
import ua.goit.java.restaurant.service.EmployeeService;
import ua.goit.java.restaurant.service.OrderService;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class OrderController {

    private EmployeeService employeeService;
    private DishService dishService;
    private OrderService orderService;

    @RequestMapping(value= "/orders", method = RequestMethod.GET)
    public ModelAndView orders(){

        ModelAndView modelAndView = new ModelAndView();
        List<OrderForController> orders = orderService.getAll().stream().
                map(order -> new OrderForController(order.getWaiter().getName(), order.getTableNumber())).
                collect(Collectors.toList());
        modelAndView.addObject("orders", orders);
        modelAndView.setViewName("orders");
        return modelAndView;
    }

    @Autowired
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Autowired
    public void setDishService(DishService dishService) {
        this.dishService = dishService;
    }

    @Autowired
    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }
}
