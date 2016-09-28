package ua.goit.java.restaurant.web;


import org.springframework.stereotype.Controller;
import ua.goit.java.restaurant.service.EmployeeService;

import java.util.Map;

@Controller
public class EmployeeController {

    private EmployeeService employeeService;

    public String employees(Map<String, Object> model){

        model.put("employees", employeeService.getAll());

        return "employees";
    }

    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
}
