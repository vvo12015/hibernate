package ua.goit.java.restaurant.service;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.goit.java.restaurant.dao.DishDao;
import ua.goit.java.restaurant.model.Dish;
import ua.goit.java.restaurant.model.DishCategory;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@org.springframework.stereotype.Controller
public class DishService extends AbstractService<Dish, DishDao> {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){
        return "index";
    }


    @Transactional
    public void init(){
        Set<Dish> dishes = new HashSet<>(dao.findAll());

        Dish plov = new Dish(DishCategory.MAIN, "Plov", 300F, 5.00F, "dishPhotos");
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
