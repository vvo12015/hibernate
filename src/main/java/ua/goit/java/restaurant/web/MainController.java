package ua.goit.java.restaurant.web;

import org.omg.CORBA.Object;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class MainController{

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Map<String, Object> model){
        return "index";
    }

    @RequestMapping(value = "/contacts")
    public String contacts(){
        return "contacts";
    }

    @RequestMapping(value = "/schema_restaurant")
    public String schemaRestaurant(){
        return "schema_restaurant";
    }

    @RequestMapping(value = "/index_admin")
    public String index_admin(){
        return "index_admin";
    }



}
