package ua.goit.java.dao.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.transaction.annotation.Transactional;
import ua.goit.java.dao.OrderDao;
import ua.goit.java.model.Orders;
import ua.goit.java.model.Waiter;

import java.util.List;

public class HOrderDao extends HAbstractDao<Orders> implements OrderDao{

    @Override
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @Transactional
    public Orders load(Long orderId) {
        Orders orders = new Orders();
        sessionFactory.getCurrentSession().load(orders, orderId);
        return orders;
    }

    @Override
    @Transactional
    public List<Orders> findByWaiterName(Waiter waiter) {

        Session session = sessionFactory.getCurrentSession();

        Query<Orders> query = session.createQuery("select o from Orders o where o.waiter= :waiter");
        query.setParameter("waiter", waiter);

        return query.list();
    }
}
