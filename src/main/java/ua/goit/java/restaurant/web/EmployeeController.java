package ua.goit.java.restaurant.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import ua.goit.java.restaurant.Position;
import ua.goit.java.restaurant.model.Employee;
import ua.goit.java.restaurant.service.EmployeeService;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class EmployeeController {

    private EmployeeService employeeService;

    @RequestMapping(value= "/employee_admin", method = RequestMethod.GET)
    public ModelAndView employee_admin(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("employees", employeeService.getAll());
        modelAndView.setViewName("employee_admin");
        return modelAndView;
    }

    @RequestMapping(value= "/employees", method = RequestMethod.GET)
    @ResponseBody
    public List<Employee> employees(){
        List<Employee> result = employeeService.getAll();

        return result;
    }

    @RequestMapping(value= "/waiters", method = RequestMethod.GET)
    @ResponseBody
    public List<Employee> waiters(){
        List<Employee> result = employeeService.getAll();

        return result.stream().filter(employee -> employee.getPosition().equals(Position.WAITER)).collect(Collectors.toList());
    }

    @RequestMapping(value = "/employeeList", method = RequestMethod.GET)
    public String employeeList(){
        return "employeeList";
    }

    @RequestMapping(value= "/employee/{employeeName}", method = RequestMethod.GET)
    @ResponseBody
    public Employee employee(@PathVariable String employeeName){
        return employeeService.getEmployeeByName(employeeName);
    }

    @Autowired
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
}
