package ua.goit.java.restaurant.service;

import ua.goit.java.restaurant.dao.hibernate.HIngredientDao;
import ua.goit.java.restaurant.model.Ingredient;

public class IngredientService extends AbstractService<Ingredient, HIngredientDao> {

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
