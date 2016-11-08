package ua.goit.java.restaurant.service;

import org.springframework.transaction.annotation.Transactional;
import ua.goit.java.restaurant.dao.hibernate.HIngredientDao;
import ua.goit.java.restaurant.model.Dish;
import ua.goit.java.restaurant.model.Ingredient;

import java.util.List;
import java.util.stream.Collectors;

public class IngredientService extends AbstractService<Ingredient, HIngredientDao> {

    public Ingredient getIngredientByName(String ingredientName) {

        return dao.findByName(ingredientName);
    }

    public void init() {
        dao.save(new Ingredient("Potato", "g"));
        dao.save(new Ingredient("Cabbage", "g"));
        dao.save(new Ingredient("Butter", "g"));
        dao.save(new Ingredient("Oil", "l"));
        dao.save(new Ingredient("Sugar", "g"));
        dao.save(new Ingredient("Cheese", "g"));
        dao.save(new Ingredient("Pork", "g"));
        dao.save(new Ingredient("Chocolate", "g"));
        dao.save(new Ingredient("Apple", "g"));
        dao.save(new Ingredient("Beet", "g"));
        dao.save(new Ingredient("Rice", "g"));
        dao.save(new Ingredient("Greens", "g"));
        dao.save(new Ingredient("Feta", "g"));
        dao.save(new Ingredient("Olives", "g"));
    }


    @Transactional
    public List<Ingredient> createIngredients(List<String> ingredients) {

        List<Ingredient> result = ingredients.stream()
                .map(ingredientName -> dao.findByName(ingredientName))
                .collect(Collectors.toList());

        return result;
    }
}
