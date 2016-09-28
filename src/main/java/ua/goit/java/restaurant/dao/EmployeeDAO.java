package ua.goit.java.restaurant.dao;

import ua.goit.java.restaurant.model.Employee;
import ua.goit.java.restaurant.model.Waiter;

public interface EmployeeDAO extends BaseDao<Employee>{

    Waiter loadWaiter(Long id);

    Employee findByName(String employeeName);

    Waiter findWaiterByName(String name);
}

