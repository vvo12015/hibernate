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
    
    private class Ingredients{
        List<Ingredient> list;

        public Ingredients(List<String> ingredientName) {
            list = new ArrayList<>();
            ingredientName.stream().forEach(name -> list.add(ingredientService.getIngredientByName(name)));
        }

        public List<Ingredient> getList() {
            return list;
        }

        public void setList(List<Ingredient> list) {
            this.list = list;
        }
    }

    @Transactional
    public void init(){
        Set<Dish> dishes = new HashSet<>(dao.findAll());
        List<Dish> dishList = new ArrayList<>();
        Map<String, List<Ingredient>> ingredients = new HashMap<>();

        String dishName = "Plov";
        Float dishWeight = 300F;
        Float dishPrice = 5.00F;
        ingredients.put(dishName, new ArrayList<>(
                ingredientService.createIngredients(new ArrayList<>(Arrays.asList("Rice", "Pork", "Greens")))));
        dishList.add(new Dish(ingredients.get(dishName), DishCategory.MAIN, dishName, dishWeight, dishPrice, "plovPhoto"));

        dishName = "Salad";
        dishWeight = 200F;
        dishPrice = 2.00F;
        ingredients.put(dishName, new ArrayList<>(
                ingredientService.createIngredients(new ArrayList<>(Arrays.asList("Olives", "Feta", "Greens")))));
        dishList.add(new Dish(ingredients.get(dishName), DishCategory.MAIN, dishName, dishWeight, dishPrice, "saladPhoto"));

        dishName = "Potato";
        dishWeight = 100F;
        dishPrice = 3.00F;
        ingredients.put(dishName, new ArrayList<>(
                ingredientService.createIngredients(new ArrayList<>(Arrays.asList("Potato", "Butter")))));
        dishList.add(new Dish(ingredients.get(dishName), DishCategory.MAIN, dishName, dishWeight, dishPrice, "potatoPhoto"));

        dishName = "Borshch";
        dishWeight = 300F;
        dishPrice = 1.00F;
        ingredients.put(dishName, new ArrayList<>(
                ingredientService.createIngredients(new ArrayList<>(Arrays.asList("Potato", "Cabbage", "Beet", "Pork")))));
        dishList.add(new Dish(ingredients.get(dishName), DishCategory.MAIN, dishName, dishWeight, dishPrice, "borshchPhoto"));

        dishName = "Hot Dog";
        dishWeight = 150F;
        dishPrice = 1.00F;
        ingredients.put(dishName, new ArrayList<>(
                ingredientService.createIngredients(new ArrayList<>(Arrays.asList("Greens", "Pork")))));
        dishList.add(new Dish(ingredients.get(dishName), DishCategory.MAIN, dishName, dishWeight, dishPrice, "hotDogPhoto"));

        dishName = "Sandwich";
        dishWeight = 150F;
        dishPrice = 1.00F;
        ingredients.put(dishName, new ArrayList<>(
                ingredientService.createIngredients(new ArrayList<>(Arrays.asList("Cheese", "Greens", "Pork")))));
        dishList.add(new Dish(ingredients.get(dishName), DishCategory.MAIN, dishName, dishWeight, dishPrice, "sandwichPhoto"));

        dishName = "Cheese Burger";
        dishWeight = 150F;
        dishPrice = 1.00F;
        ingredients.put(dishName, new ArrayList<>(
                ingredientService.createIngredients(new ArrayList<>(Arrays.asList("Cheese", "Greens", "Pork")))));
        dishList.add(new Dish(ingredients.get(dishName), DishCategory.MAIN, dishName, dishWeight, dishPrice, "cheeseBurgerPhotoPhoto"));

        dishName = "Chocolate cake";
        dishWeight = 150F;
        dishPrice = 3.00F;
        ingredients.put(dishName, new ArrayList<>(
                ingredientService.createIngredients(new ArrayList<>(Arrays.asList("Sugar", "Chocolate")))));
        dishList.add(new Dish(ingredients.get(dishName), DishCategory.MAIN, dishName, dishWeight, dishPrice, "chocolateCakePhoto"));

        dishName = "Apple pie";
        dishWeight = 200F;
        dishPrice = 2.00F;
        ingredients.put(dishName, new ArrayList<>(
                ingredientService.createIngredients(new ArrayList<>(Arrays.asList("Sugar", "Apple")))));
        dishList.add(new Dish(ingredients.get(dishName), DishCategory.MAIN, dishName, dishWeight, dishPrice, "applePiePhoto"));

        dishName = "Cheese cake";
        dishWeight = 150F;
        dishPrice = 1.00F;
        ingredients.put(dishName, new ArrayList<>(
                ingredientService.createIngredients(new ArrayList<>(Arrays.asList("Sugar", "Cheese")))));
        dishList.add(new Dish(ingredients.get(dishName), DishCategory.MAIN, dishName, dishWeight, dishPrice, "cheeseCakePhoto"));

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
