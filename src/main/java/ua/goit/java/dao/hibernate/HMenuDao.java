package ua.goit.java.dao.hibernate;

import org.hibernate.Session;
import org.hibernate.query.Query;
import ua.goit.java.dao.MenuDao;
import ua.goit.java.model.Menu;

public class HMenuDao extends HAbstractDao<Menu> implements MenuDao{

    @Override
    public Menu load(Long id) {

        Menu menu = new Menu();
        sessionFactory.getCurrentSession().load(menu, id);

        return menu;
    }

    @Override
    public Menu findByName(String name) {
        Session session = sessionFactory.getCurrentSession();

        Query query = session.createQuery("select m from Menu m where m.name like :name");
        query.setParameter("name", name);

        return (Menu) query.list().get(0);
    }
}
