package ua.goit.java.restaurant.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.goit.java.restaurant.forForm.DishComparatorAsc;
import ua.goit.java.restaurant.forForm.DishForm;
import ua.goit.java.restaurant.forForm.IngredientComparatorAsc;
import ua.goit.java.restaurant.forForm.MenuForm;
import ua.goit.java.restaurant.model.Dish;
import ua.goit.java.restaurant.model.Ingredient;
import ua.goit.java.restaurant.model.Menu;
import ua.goit.java.restaurant.service.DishService;
import ua.goit.java.restaurant.service.IngredientService;

import java.util.List;

@Controller
public class DishController {

    private DishService dishService;
    private IngredientService ingredientService;

    @RequestMapping(value= "/dish", method = RequestMethod.GET)
    public ModelAndView dish(@RequestParam("id") String number){
        Long id = Long.valueOf(number);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("dish", dishService.getById(id));
        modelAndView.setViewName("dish");
        return modelAndView;
    }

    @RequestMapping(value = "/dishIngredients", method = RequestMethod.GET)
    @ResponseBody
    public List<Ingredient> listIngredient(@RequestParam("id") String number){
        Long id = Long.valueOf(number);
        return dishService.getById(id).getIngredients();
    }

    @RequestMapping(value= "/dish_admin", method = RequestMethod.GET)
    public ModelAndView dish_admin(){
        ModelAndView modelAndView = new ModelAndView();
        List<Dish> dishList = dishService.getAll();
        dishList.sort(new DishComparatorAsc());
        modelAndView.addObject("dishList", dishList);
        List<Ingredient> ingredientList = ingredientService.getAll();
        ingredientList.sort(new IngredientComparatorAsc());
        modelAndView.addObject("ingredientList", ingredientList);
        modelAndView.setViewName("dish_admin");
        return modelAndView;
    }

    @RequestMapping(value = "/dish_admin", method = RequestMethod.POST)
    public ModelAndView dish(
            @ModelAttribute("dish") DishForm dishForm){
        Dish dish = dishService.getById(dishForm.getId());
        if (dishForm.getSave() != null) {
            dish.setName(dishForm.getName());
            dish.setPhoto(dishForm.getPhoto());
            dish.setIngredients(ingredientService.createIngredients(dishForm.getIngredients()));
            dishService.update(dish);
        }
        if (dishForm.getDelete() != null){
            dishService.delete(dish);
        }

        return dish_admin();
    }

    @Autowired
    public void setDishService(DishService dishService) {
        this.dishService = dishService;
    }

    @Autowired
    public void setIngredientService(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }
}
