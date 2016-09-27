package ua.goit.java.controllers;

import ua.goit.java.dao.hibernate.HIngredientDao;
import ua.goit.java.model.Ingredient;

public class IngredientController extends AbstractController<Ingredient, HIngredientDao>{

    public Ingredient getIngredientByName(String ingredientName) {

        return dao.findByName(ingredientName);
    }

    public void init() {
        dao.save(new Ingredient("Potato", "kg"));
        dao.save(new Ingredient("Cabbage", "kg"));
        dao.save(new Ingredient("Butter", "g"));
        dao.save(new Ingredient("Oil", "l"));
    }
}
