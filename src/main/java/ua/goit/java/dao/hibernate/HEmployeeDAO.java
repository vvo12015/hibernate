package ua.goit.java.dao.hibernate;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.transaction.annotation.Transactional;
import ua.goit.java.dao.EmployeeDAO;
import ua.goit.java.model.Employee;
import ua.goit.java.model.Waiter;

public class HEmployeeDAO extends HAbstractDao<Employee> implements EmployeeDAO{

    @Override
    @Transactional
    public Employee load(Long id) {
        Employee employee = new Employee();
        sessionFactory.getCurrentSession().load(employee, id);
        return employee;
    }

    @Override
    @Transactional
    public Waiter loadWaiter(Long id){
        Waiter waiter = new Waiter();
        sessionFactory.getCurrentSession().load(waiter, id);
        return waiter;
    }

    @Override
    @Transactional
    public Employee findByName(String name) {

        Session session = sessionFactory.getCurrentSession();

        Query query = session.createQuery("select e from Employee e where e.name like :name");
        query.setParameter("name", name);

        return (Employee) query.list().get(0);
    }

    @Override
    @Transactional
    public Waiter findWaiterByName(String name) {

        Session session = sessionFactory.getCurrentSession();

        Query query = session.createQuery("select w from Employee w where w.name like :name");
        query.setParameter("name", name);

        return (Waiter) query.list().get(0);
    }


}
