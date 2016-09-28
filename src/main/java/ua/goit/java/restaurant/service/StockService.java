package ua.goit.java.restaurant.service;

import org.springframework.transaction.annotation.Transactional;
import ua.goit.java.restaurant.dao.hibernate.HStockDao;
import ua.goit.java.restaurant.model.Ingredient;
import ua.goit.java.restaurant.model.Stock;

import java.util.List;


public class StockService extends AbstractService<Stock, HStockDao> {

    IngredientService ingredientService;

    public void setIngredientService(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @Transactional
    public List<Stock> getStockByNameIngredient(Ingredient ingredient) {
        return dao.findStockByNameIngredient(ingredient);
    }

    public void init() {

        Long ingredientId = 1L;

        dao.save(new Stock(ingredientService.getById(ingredientId), 9));
    }
}
