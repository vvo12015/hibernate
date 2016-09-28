package ua.goit.java.restaurant.service;

import org.springframework.transaction.annotation.Transactional;
import ua.goit.java.restaurant.dao.EmployeeDAO;
import ua.goit.java.restaurant.model.Employee;
import ua.goit.java.restaurant.model.Waiter;


public class EmployeeService extends AbstractService<Employee, EmployeeDAO> {

    @Transactional
    public void init(){
        dao.save(new Waiter("John", "Smith", "555-55-555", 25001.0F));
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
