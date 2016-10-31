package ua.goit.java.restaurant.service;

import org.springframework.transaction.annotation.Transactional;
import ua.goit.java.restaurant.dao.DishDao;
import ua.goit.java.restaurant.model.Dish;
import ua.goit.java.restaurant.model.DishCategory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class DishService extends AbstractService<Dish, DishDao> {

    @Transactional
    public void init(){
        Set<Dish> dishes = new HashSet<>(dao.findAll());
        List<Dish> dishList = new ArrayList<>();

        dishList.add(new Dish(DishCategory.MAIN, "Plov", 300F, 5.00F, "plovPhoto"));
        dishList.add(new Dish(DishCategory.MAIN, "Salad", 200F, 2.00F, "saladPhoto"));
        dishList.add(new Dish(DishCategory.MAIN, "Potato", 100F, 3.00F, "potatoPhoto"));
        dishList.add(new Dish(DishCategory.MAIN, "Borshch", 300F, 1.00F, "borshchPhoto"));
        dishList.add(new Dish(DishCategory.FAST_FOOD, "Hot Dog", 150F, 1.00F, "hotDogPhoto"));
        dishList.add(new Dish(DishCategory.FAST_FOOD, "Sandvich", 150F, 1.00F, "sandvichPhoto"));
        dishList.add(new Dish(DishCategory.FAST_FOOD, "Cheese Burger", 150F, 1.00F, "cheeseBurgerPhoto"));
        dishList.add(new Dish(DishCategory.DISERTS, "Chocolate cake", 150F, 3.00F, "chocolateCakePhoto"));
        dishList.add(new Dish(DishCategory.DISERTS, "Apple pie", 200F, 2.00F, "applePiePhoto"));
        dishList.add(new Dish(DishCategory.DISERTS, "Cheese cake", 150F, 1.00F, "cheeseCakePhoto"));

        dishList.stream().filter(dish -> !dishes.contains(dish)).forEach(dish -> dao.save(dish));
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
