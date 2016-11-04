package ua.goit.java.restaurant.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ua.goit.java.restaurant.model.Employee;
import ua.goit.java.restaurant.model.Menu;
import ua.goit.java.restaurant.service.MenuService;

import java.util.List;

@Controller
public class MenuController {

    private MenuService menuService;

    @RequestMapping(value = "/listMenu", method = RequestMethod.GET)
    @ResponseBody
    public List<Menu> listMenu(){
        return menuService.getAll();
    }

    @RequestMapping(value = "/menu", method = RequestMethod.GET)
    public String mainMenu(){
        return "menu";
    }

    @RequestMapping(value= "/editMenu", method = RequestMethod.POST)
    @ResponseBody
    public String saveMenu(Menu menu){

        menuService.delete(menuService.getById(menu.getId()));
        menuService.save(menu);

        return "menu";
    }


    @Autowired
    public void setMenuService(MenuService menuService) {
        this.menuService = menuService;
    }
}
