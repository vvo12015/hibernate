package ua.goit.java.restaurant.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ua.goit.java.restaurant.service.IngredientService;
import ua.goit.java.restaurant.service.StockService;

@Controller
public class StockController {

    private IngredientService ingredientService;
    private StockService stockService;

    @RequestMapping(value= "/stock", method = RequestMethod.GET)
    public ModelAndView stock(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("stock", stockService.getAll());
        modelAndView.setViewName("stock");
        return modelAndView;
    }

    @Autowired
    public void setIngredientService(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @Autowired
    public void setStockService(StockService stockService) {
        this.stockService = stockService;
    }
}
