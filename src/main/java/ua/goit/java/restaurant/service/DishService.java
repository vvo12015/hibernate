package ua.goit.java.restaurant.service;

import org.springframework.transaction.annotation.Transactional;
import ua.goit.java.restaurant.dao.DishDao;
import ua.goit.java.restaurant.model.Dish;
import ua.goit.java.restaurant.model.DishCategory;
import ua.goit.java.restaurant.model.Ingredient;

import java.util.*;
import java.util.stream.Collectors;


public class DishService extends AbstractService<Dish, DishDao> {

    private IngredientService ingredientService;

    public void setIngredientService(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @Transactional
    public void init(){
        Set<Dish> dishes = new HashSet<>(dao.findAll());
        List<Dish> dishList = new ArrayList<>();

        List<Ingredient> listIngredients = new ArrayList<>();
        listIngredients.add(ingredientService.getIngredientByName("Rice"));
        listIngredients.add(ingredientService.getIngredientByName("Pork"));
        listIngredients.add(ingredientService.getIngredientByName("Greens"));
        dishList.add(new Dish(listIngredients, DishCategory.MAIN, "Plov", 300F, 5.00F, "plovPhoto"));
        listIngredients.clear();
        listIngredients.add(ingredientService.getIngredientByName("Olives"));
        listIngredients.add(ingredientService.getIngredientByName("Greens"));
        listIngredients.add(ingredientService.getIngredientByName("Feta"));
        dishList.add(new Dish(listIngredients, DishCategory.MAIN, "Salad", 200F, 2.00F, "saladPhoto"));
        listIngredients.clear();
        listIngredients.add(ingredientService.getIngredientByName("Potato"));
        listIngredients.add(ingredientService.getIngredientByName("Butter"));
        dishList.add(new Dish(listIngredients, DishCategory.MAIN, "Potato", 100F, 3.00F, "potatoPhoto"));
        listIngredients.clear();
        listIngredients.add(ingredientService.getIngredientByName("Potato"));
        listIngredients.add(ingredientService.getIngredientByName("Cabbage"));
        listIngredients.add(ingredientService.getIngredientByName("Beet"));
        listIngredients.add(ingredientService.getIngredientByName("Pork"));
        dishList.add(new Dish(listIngredients, DishCategory.MAIN, "Borshch", 300F, 1.00F, "borshchPhoto"));
        listIngredients.clear();
        listIngredients.add(ingredientService.getIngredientByName("Pork"));
        listIngredients.add(ingredientService.getIngredientByName("Greens"));
        dishList.add(new Dish(listIngredients, DishCategory.FAST_FOOD, "Hot Dog", 150F, 1.00F, "hotDogPhoto"));
        listIngredients.clear();
        listIngredients.add(ingredientService.getIngredientByName("Pork"));
        listIngredients.add(ingredientService.getIngredientByName("Greens"));
        listIngredients.add(ingredientService.getIngredientByName("Cheese"));
        dishList.add(new Dish(listIngredients, DishCategory.FAST_FOOD, "Sandvich", 150F, 1.00F, "sandvichPhoto"));
        listIngredients.clear();
        listIngredients.add(ingredientService.getIngredientByName("Pork"));
        listIngredients.add(ingredientService.getIngredientByName("Greens"));
        listIngredients.add(ingredientService.getIngredientByName("Cheese"));
        dishList.add(new Dish(listIngredients, DishCategory.FAST_FOOD, "Cheese Burger", 150F, 1.00F, "cheeseBurgerPhoto"));
        listIngredients.clear();
        listIngredients.add(ingredientService.getIngredientByName("Sugar"));
        listIngredients.add(ingredientService.getIngredientByName("Chocolate"));
        dishList.add(new Dish(listIngredients, DishCategory.DISERTS, "Chocolate cake", 150F, 3.00F, "chocolateCakePhoto"));
        listIngredients.clear();
        listIngredients.add(ingredientService.getIngredientByName("Sugar"));
        listIngredients.add(ingredientService.getIngredientByName("Apple"));
        dishList.add(new Dish(listIngredients, DishCategory.DISERTS, "Apple pie", 200F, 2.00F, "applePiePhoto"));
        listIngredients.clear();
        listIngredients.add(ingredientService.getIngredientByName("Sugar"));
        listIngredients.add(ingredientService.getIngredientByName("Cheese"));
        dishList.add(new Dish(listIngredients, DishCategory.DISERTS, "Cheese cake", 150F, 1.00F, "cheeseCakePhoto"));

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
