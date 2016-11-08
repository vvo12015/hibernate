package ua.goit.java.restaurant.forForm;

import ua.goit.java.restaurant.model.Employee;

import java.util.Comparator;

public class EmployeeComparatorAsc implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
