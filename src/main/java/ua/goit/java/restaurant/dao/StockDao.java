package ua.goit.java.restaurant.dao;

import org.springframework.transaction.annotation.Transactional;
import ua.goit.java.restaurant.model.Ingredient;
import ua.goit.java.restaurant.model.Stock;

import java.util.List;

public interface StockDao extends BaseDao<Stock>{

    @Transactional
    List<Stock> findStockByNameIngredient(Ingredient ingredientForFind);
}
