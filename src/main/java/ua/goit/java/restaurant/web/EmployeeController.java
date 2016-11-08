package ua.goit.java.restaurant.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.goit.java.restaurant.Position;
import ua.goit.java.restaurant.forForm.EmployeeComparatorAsc;
import ua.goit.java.restaurant.forForm.EmployeeForm;
import ua.goit.java.restaurant.model.Employee;
import ua.goit.java.restaurant.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class EmployeeController {

    private EmployeeService employeeService;

    @RequestMapping(value= "/employee_admin", method = RequestMethod.GET)
    public ModelAndView employee_admin(){
        ModelAndView modelAndView = new ModelAndView();
        List<Employee> employeeList = new ArrayList<>();
        employeeList = employeeService.getAll();
        employeeList.sort(new EmployeeComparatorAsc());
        modelAndView.addObject("employeeList", employeeList);
        modelAndView.addObject("positionList", Position.values());
        modelAndView.setViewName("employee_admin");
        return modelAndView;
    }

    @RequestMapping(value = "/employee_admin", method = RequestMethod.POST)
    public ModelAndView employee(
            @ModelAttribute("employee") EmployeeForm employeeForm){
        Employee employee = employeeService.getById(employeeForm.getId());
        if (employeeForm.getSave() != null) {
            employee.setName(employeeForm.getName());
            employee.setSurName(employeeForm.getSurName());
            employee.setPhoneNumber(employeeForm.getPhoneNumber());
            employee.setPosition(employeeForm.getPosition());
            employee.setSalary(employeeForm.getSalary());

            employeeService.update(employee);
        }
        if (employeeForm.getDelete() != null){
            employeeService.delete(employee);
        }

        return employee_admin();
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
