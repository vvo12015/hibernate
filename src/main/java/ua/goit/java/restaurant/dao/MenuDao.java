package ua.goit.java.restaurant.dao;

import ua.goit.java.restaurant.model.Menu;

public interface MenuDao extends BaseDao<Menu>{


    Menu findByName(String menuName);
}
