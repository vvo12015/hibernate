package ua.goit.java.controllers;

import org.springframework.transaction.annotation.Transactional;
import ua.goit.java.dao.DishDao;
import ua.goit.java.model.Dish;
import ua.goit.java.model.DishCategory;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DishController extends AbstractController<Dish, DishDao> {

    @Transactional
    public void init(){
        Set<Dish> dishes = new HashSet<>(dao.findAll());

        Dish plov = new Dish(DishCategory.MAIN, "Plov", 300F, 5.00F, "dishPhoto");
        Dish salad = new Dish(DishCategory.MAIN, "Salad", 200F, 2.00F, "dishPhoto");
        Dish potato = new Dish(DishCategory.MAIN, "Potato", 100F, 3.00F, "dishPhoto");

        if (!dishes.contains(plov)){
            dao.save(plov);
        }
        if (!dishes.contains(salad)){
            dao.save(salad);
        }
        if (!dishes.contains(potato)){
            dao.save(potato);
        }
    }

    @Transactional
    public Dish getDishByName(String name){
        return dao.findByName(name);
    }

    @Transactional
    public List<Dish> createDishes(List<String> dishes) {

        List<Dish> result = dishes.stream()
                .map(dishName -> dao.findByName(dishName))
                .collect(Collectors.toList());

        return result;
    }

}
