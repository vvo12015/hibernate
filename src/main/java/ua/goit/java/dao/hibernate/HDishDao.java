package ua.goit.java.dao.hibernate;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.transaction.annotation.Transactional;
import ua.goit.java.dao.DishDao;
import ua.goit.java.model.Dish;

public class HDishDao extends HAbstractDao<Dish> implements DishDao{

    @Override
    public Dish load(Long id) {
        return sessionFactory.getCurrentSession().load(Dish.class, id);
    }

    @Override
    @Transactional
    public Dish findByName(String name) {

        Session session = sessionFactory.getCurrentSession();

        Query query = session.createQuery("select d from Dish d where d.name like :name");
        query.setParameter("name", name);

        return (Dish) query.list().get(0);
    }
}
