package ua.goit.java.restaurant.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.goit.java.restaurant.service.MenuService;

@Controller
public class MenuController {

    private MenuService menuService;

    @RequestMapping(value = "/menu")
    public String mainMenu(){
        return "menu";
    }

    @Autowired
    public void setMenuService(MenuService menuService) {
        this.menuService = menuService;
    }
}
