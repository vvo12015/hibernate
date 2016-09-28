package ua.goit.java.restaurant.dao.hibernate;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.transaction.annotation.Transactional;
import ua.goit.java.restaurant.dao.StockDao;
import ua.goit.java.restaurant.model.Ingredient;
import ua.goit.java.restaurant.model.Stock;

import java.util.List;

public class HStockDao extends HAbstractDao<Stock> implements StockDao {

    @Override
    @Transactional
    public Stock load(Long ingredientId) {

        Stock stock = new Stock();

        sessionFactory.getCurrentSession().load(stock, ingredientId);

        return stock;
    }

    @Override
    @Transactional
    public List<Stock> findStockByNameIngredient(Ingredient ingredient) {
        Session session = sessionFactory.getCurrentSession();

        Query query = session.createQuery("select i from Stock i where i.ingredient= :ingredient");
        query.setParameter("ingredient", ingredient);

        return (List<Stock>) query.list();
    }
}
