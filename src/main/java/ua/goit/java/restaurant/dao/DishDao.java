package ua.goit.java.restaurant.dao;

import ua.goit.java.restaurant.model.Dish;

public interface DishDao extends BaseDao<Dish>{

    Dish findByName(String DishName);
}
