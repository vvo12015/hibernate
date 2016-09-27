package ua.goit.java.dao;

import org.springframework.transaction.annotation.Transactional;
import ua.goit.java.model.Ingredient;
import ua.goit.java.model.Stock;

import java.util.List;

public interface StockDao extends BaseDao<Stock>{

    @Transactional
    List<Stock> findStockByNameIngredient(Ingredient ingredient);
}
