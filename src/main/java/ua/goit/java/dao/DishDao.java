package ua.goit.java.dao;

import ua.goit.java.model.Dish;

public interface DishDao extends BaseDao<Dish>{

    Dish findByName(String DishName);
}
