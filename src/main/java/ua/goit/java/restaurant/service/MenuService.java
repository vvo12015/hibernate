package ua.goit.java.restaurant.service;

import org.springframework.transaction.annotation.Transactional;
import ua.goit.java.restaurant.dao.MenuDao;
import ua.goit.java.restaurant.model.Menu;

public class MenuService extends AbstractService<Menu, MenuDao> {

    private DishService dishService;

    public void setDishService(DishService dishService) {
        this.dishService = dishService;
    }

    @Transactional
    public Menu getMenuByName(String name) {
        return dao.findByName(name);
    }

    public void init() {
        dao.save(new Menu("init", dishService.getAll(), "pHoto"));
    }
}
