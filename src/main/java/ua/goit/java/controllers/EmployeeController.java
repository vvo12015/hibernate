package ua.goit.java.controllers;

import org.springframework.transaction.annotation.Transactional;
import ua.goit.java.dao.EmployeeDAO;
import ua.goit.java.model.Employee;
import ua.goit.java.model.Waiter;


public class EmployeeController extends AbstractController<Employee, EmployeeDAO>{

    @Transactional
    public void init(){
        dao.save(new Waiter("John", "Smith", "555-55-555", 25000.0F));
        dao.save(new Waiter("Mary", "Svach", "555-55-555", 20000.0F));
        dao.save(new Waiter("Bob", "Vil", "555-55-555", 15000.0F));
    }

    @Transactional
    public Employee getEmployeeByName(String name){
        return dao.findByName(name);
    }

    @Transactional
    public Waiter getWaiterById(Long id) {
        return dao.loadWaiter(id);
    }

    public Waiter getWaiterByName(String waiterName) {
        return dao.findWaiterByName(waiterName);
    }
}
