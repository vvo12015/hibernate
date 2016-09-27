package ua.goit.java.dao;

import ua.goit.java.model.Menu;

public interface MenuDao extends BaseDao<Menu>{


    Menu findByName(String name);
}
