package ua.goit.java.restaurant.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import ua.goit.java.restaurant.model.Ingredient;
import ua.goit.java.restaurant.model.Menu;
import ua.goit.java.restaurant.service.DishService;

import java.util.List;

@Controller
public class DishController {

    private DishService dishService;

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
        modelAndView.addObject("dishes", dishService.getAll());
        modelAndView.setViewName("dish_admin");
        return modelAndView;
    }

    @Autowired
    public void setDishService(DishService dishService) {
        this.dishService = dishService;
    }
}
