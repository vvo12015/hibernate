package ua.goit.java.controllers;

import org.springframework.transaction.annotation.Transactional;
import ua.goit.java.dao.DishDao;
import ua.goit.java.model.Dish;
import ua.goit.java.model.DishCategory;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DishController {

    private DishDao dishDao;

    @Transactional
    public void initDishes(){
        Set<Dish> dishes = new HashSet<>(dishDao.findAll());

        Dish plov = new Dish(DishCategory.MAIN, "Plov", 300F, 5.00F, "dishPhoto");
        Dish salad = new Dish(DishCategory.MAIN, "Salad", 200F, 2.00F, "dishPhoto");
        Dish potato = new Dish(DishCategory.MAIN, "Potato", 100F, 3.00F, "dishPhoto");

        if (!dishes.contains(plov)){
            dishDao.save(plov);
        }
        if (!dishes.contains(salad)){
            dishDao.save(salad);
        }
        if (!dishes.contains(potato)){
            dishDao.save(potato);
        }
    }

    @Transactional
    public void save(Dish dish){
        dishDao.save(dish);
    }

    @Transactional
    public List<Dish> getAllDishes(){
        return dishDao.findAll();
    }

    @Transactional
    public Dish getDishByName(String name){
        return dishDao.findByName(name);
    }

    public void setDishDao(DishDao dishDao) {
        this.dishDao = dishDao;
    }

    @Transactional
    public void removeAllDishes() {
        dishDao.removeAll();
    }

    @Transactional
    public void removeDish(Dish dish) {
        dishDao.remove(dish);
    }
}
