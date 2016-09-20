package ua.goit.java.dao.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;
import ua.goit.java.dao.BaseDao;

import java.util.List;

public abstract class HAbstractDao<T> implements BaseDao<T>{

    protected SessionFactory sessionFactory;
    protected  String tableName;

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Override
    @Transactional
    public List<T> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("select e from " + tableName + " e").list();
    }

    @Override
    @Transactional
    public void save(T object) {
        sessionFactory.getCurrentSession().save(object);
    }

    @Override
    @Transactional
    public void removeAll() {
        sessionFactory.getCurrentSession().createQuery("delete from " + tableName).executeUpdate();
    }

    @Override
    @Transactional
    public void remove(T object) {
        sessionFactory.getCurrentSession().delete(object);
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
