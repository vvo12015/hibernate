package ua.goit.java.controllers;

import org.springframework.transaction.annotation.Transactional;
import ua.goit.java.dao.hibernate.HStockDao;
import ua.goit.java.model.Ingredient;
import ua.goit.java.model.Stock;

import java.util.List;


public class StockController extends AbstractController<Stock, HStockDao>{

    IngredientController ingredientController;

    public void setIngredientController(IngredientController ingredientController) {
        this.ingredientController = ingredientController;
    }

    @Transactional
    public List<Stock> getStockByNameIngredient(Ingredient ingredient) {
        return dao.findStockByNameIngredient(ingredient);
    }

    public void init() {

        Long ingredientId = 1L;

        dao.save(new Stock(ingredientController.getById(ingredientId), 10));
    }
}
