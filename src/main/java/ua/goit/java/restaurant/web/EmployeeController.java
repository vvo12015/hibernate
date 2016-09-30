package ua.goit.java.restaurant.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ua.goit.java.restaurant.service.EmployeeService;

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
    public ModelAndView employees(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("employees", employeeService.getAll());
        modelAndView.setViewName("employees");
        return modelAndView;
    }

    @Autowired
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
}
