package ua.goit.java.dao.hibernate;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.transaction.annotation.Transactional;
import ua.goit.java.dao.EmployeeDAO;
import ua.goit.java.model.Employee;

public class HEmployeeDAO extends HAbstractDao<Employee> implements EmployeeDAO{

    @Override
    public Employee load(Long id) {
        return sessionFactory.getCurrentSession().load(Employee.class, id);
    }

    @Override
    @Transactional
    public Employee findByName(String name) {

        Session session = sessionFactory.getCurrentSession();

        Query query = session.createQuery("select e from Employee e where e.name like :name");
        query.setParameter("name", name);

        return (Employee) query.list().get(0);
    }

}
