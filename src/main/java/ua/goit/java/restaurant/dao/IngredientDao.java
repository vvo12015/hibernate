package ua.goit.java.restaurant.dao;


import ua.goit.java.restaurant.model.Ingredient;

public interface IngredientDao {

    Ingredient findByName(String name);
}
