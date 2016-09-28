package ua.goit.java.restaurant.dao.hibernate;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.transaction.annotation.Transactional;
import ua.goit.java.restaurant.dao.DishDao;
import ua.goit.java.restaurant.model.Dish;

public class HDishDao extends HAbstractDao<Dish> implements DishDao{

    @Override
    @Transactional
    public Dish load(Long id) {
        Dish dish = new Dish();
        sessionFactory.getCurrentSession().load(dish, id);
        return dish;
    }

    @Override
    @Transactional
    public Dish findByName(String dishName) {

        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("select d from Dish d where d.name like :name");
        query.setParameter("name", dishName);
        return (Dish) query.list().get(0);
    }
}
