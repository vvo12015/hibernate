package ua.goit.java.controllers;

import org.springframework.transaction.annotation.Transactional;
import ua.goit.java.dao.EmployeeDAO;
import ua.goit.java.model.Employee;
import ua.goit.java.model.Waiter;

import java.util.List;


public class EmployeeController {

    EmployeeDAO employeeDao;

    public void setEmployeeDao(EmployeeDAO employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Transactional
    public void initEmployees(){
        employeeDao.save(new Waiter("John", "Smith", "555-55-555", 25000.0F));
        employeeDao.save(new Waiter("Mary", "Svach", "555-55-555", 20000.0F));
        employeeDao.save(new Waiter("Bob", "Vil", "555-55-555", 15000.0F));
    }

    @Transactional
    public List<Employee> getAllEmployees(){
        return employeeDao.findAll();
    }

    @Transactional
    public Employee getEmployeeByName(String name){
        return employeeDao.findByName(name);
    }

    @Transactional
    public void removeAllEmployees() {
        employeeDao.removeAll();
    }

    @Transactional
    public void createEmployee(Employee employee) {
        employeeDao.save(employee);
    }

    @Transactional
    public void removeEmployees(Employee employee) {
        employeeDao.remove(employee);
    }
}
