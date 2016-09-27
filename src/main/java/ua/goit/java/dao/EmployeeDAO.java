package ua.goit.java.dao;

import ua.goit.java.model.Employee;
import ua.goit.java.model.Waiter;

public interface EmployeeDAO extends BaseDao<Employee>{

    Waiter loadWaiter(Long id);

    Employee findByName(String name);

    Waiter findWaiterByName(String name);
}

