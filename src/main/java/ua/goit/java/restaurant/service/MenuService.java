package ua.goit.java.restaurant.service;

import org.springframework.transaction.annotation.Transactional;
import ua.goit.java.restaurant.dao.MenuDao;
import ua.goit.java.restaurant.model.Dish;
import ua.goit.java.restaurant.model.DishCategory;
import ua.goit.java.restaurant.model.Menu;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MenuService extends AbstractService<Menu, MenuDao> {

    private DishService dishService;

    public void setDishService(DishService dishService) {
        this.dishService = dishService;
    }

    @Transactional
    public Menu getMenuByName(String name) {
        return dao.findByName(name);
    }

    @Transactional
    public void init() {
        Arrays.stream(DishCategory.values()).forEach(dishCategory -> {
            List<Dish> dishes;
            dishes = dishService.getAll().stream()
                        .filter(dish -> dish.getCategory().equals(dishCategory))
                        .collect(Collectors.toList());
            dao.save(new Menu(
                    upFirstLetter(dishCategory.name()),
                    dishes,
                    dishCategory + "photo"));
        });

    }

    private String upFirstLetter(String line){
        return line.substring(0, 1).toUpperCase() + line.toLowerCase().substring(1);
    }
}
