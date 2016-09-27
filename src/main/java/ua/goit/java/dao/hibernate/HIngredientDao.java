package ua.goit.java.dao.hibernate;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.transaction.annotation.Transactional;
import ua.goit.java.dao.IngredientDao;
import ua.goit.java.model.Ingredient;

public class HIngredientDao extends HAbstractDao<Ingredient> implements IngredientDao {

    @Override
    @Transactional
    public Ingredient load(Long id) {

        Ingredient ingredient = new Ingredient();

        sessionFactory.getCurrentSession().load(ingredient, id);

        return ingredient ;
    }

    @Override
    @Transactional
    public Ingredient findByName(String name) {
        Session session = sessionFactory.getCurrentSession();

        Query query = session.createQuery("select i from Ingredient i where i.name like :name");
        query.setParameter("name", name);

        return (Ingredient) query.list().get(0);
    }
}
