package ua.goit.java.controllers;

import org.springframework.transaction.annotation.Transactional;
import ua.goit.java.dao.MenuDao;
import ua.goit.java.model.Menu;

public class MenuController extends AbstractController<Menu, MenuDao> {

    private DishController dishController;

    public void setDishController(DishController dishController) {
        this.dishController = dishController;
    }

    @Transactional
    public Menu getMenuByName(String name) {
        return dao.findByName(name);
    }

    public void init() {
        dao.save(new Menu("init", dishController.getAll(), "pHoto"));
    }
}
