package ua.goit.java.dao.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.transaction.annotation.Transactional;
import ua.goit.java.dao.EmployeeDAO;
import ua.goit.java.dao.OrderDao;
import ua.goit.java.model.Employee;
import ua.goit.java.model.Orders;

import java.util.List;

public class HOrderDao extends HAbstractDao<Orders> implements OrderDao{

    private SessionFactory sessionFactory;
    EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public Orders load(Long id) {
        return sessionFactory.getCurrentSession().load(Orders.class, id);
    }

    @Override
    @Transactional
    public List<Orders> findByWaiterName(String waiterName) {

        Session session = sessionFactory.getCurrentSession();

        Employee waiter = employeeDAO.findByName(waiterName);

        Query query = session.createQuery("select o from Orders o where o.waiter= :waiter");
        query.setParameter("waiter", waiter);

        return query.list();
    }

    public void setEmployeeDAO(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }
}
