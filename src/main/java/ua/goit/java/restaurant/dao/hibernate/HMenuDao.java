package ua.goit.java.restaurant.dao.hibernate;

import org.hibernate.Session;
import org.hibernate.query.Query;
import ua.goit.java.restaurant.dao.MenuDao;
import ua.goit.java.restaurant.model.Menu;

public class HMenuDao extends HAbstractDao<Menu> implements MenuDao{

    @Override
    public Menu load(Long id) {

        Menu menu = new Menu();
        sessionFactory.getCurrentSession().load(menu, id);

        return menu;
    }

    @Override
    public Menu findByName(String menuName) {
        Session session = sessionFactory.getCurrentSession();

        Query query = session.createQuery("select m from Menu m where m.name like :name");
        query.setParameter("name", menuName);

        return (Menu) query.list().get(0);
    }
}
