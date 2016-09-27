package ua.goit.java.dao;


import ua.goit.java.model.Ingredient;

public interface IngredientDao {

    Ingredient findByName(String name);
}
