package ua.goit.java.dao;

import ua.goit.java.model.Employee;

public interface EmployeeDAO extends BaseDao<Employee>{

    Employee findByName(String name);
}
