package ua.goit.java.restaurant.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import ua.goit.java.restaurant.forForm.DishComparatorAsc;
import ua.goit.java.restaurant.forForm.MenuComparatorAsc;
import ua.goit.java.restaurant.forForm.MenuForm;
import ua.goit.java.restaurant.model.Dish;
import ua.goit.java.restaurant.model.Menu;
import ua.goit.java.restaurant.service.DishService;
import ua.goit.java.restaurant.service.MenuService;

import java.util.List;

@Controller
public class MenuController {

    private MenuService menuService;
    private DishService dishService;

    @RequestMapping(value = "/listMenu", method = RequestMethod.GET)
    @ResponseBody
    public List<Menu> listMenu(){
        return menuService.getAll();
    }

    @RequestMapping(value = "/menu", method = RequestMethod.POST)
    public ModelAndView menu(
            @ModelAttribute("menu") MenuForm menuForm){
        Menu menu = menuService.getById(menuForm.getId());
        if (menuForm.getSave() != null) {
            menu.setName(menuForm.getName());
            menu.setPhoto(menuForm.getPhoto());
            menu.setDishes(dishService.createDishes(menuForm.getDishes()));
            menuService.update(menu);
        }
        if (menuForm.getDelete() != null){
            menuService.delete(menu);
        }

        return menu();
    }

    @RequestMapping(value = "/menu", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView menu(){
        ModelAndView modelAndView = new ModelAndView();
        List<Menu> menuList = menuService.getAll();
        menuList.sort(new MenuComparatorAsc());
        modelAndView.addObject("listMenu", menuList);
        List<Dish> dishList = dishService.getAll();
        dishList.sort(new DishComparatorAsc());
        modelAndView.addObject("dishList", dishList);
        modelAndView.setViewName("menu");
        return modelAndView;
    }

    @Autowired
    public void setDishService(DishService dishService) {
        this.dishService = dishService;
    }

    @Autowired
    public void setMenuService(MenuService menuService) {
        this.menuService = menuService;
    }
}
