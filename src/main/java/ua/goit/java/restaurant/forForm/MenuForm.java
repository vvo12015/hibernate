package ua.goit.java.restaurant.forForm;

import ua.goit.java.restaurant.model.Dish;
import ua.goit.java.restaurant.service.Service;
import ua.goit.java.restaurant.service.EmployeeService;
import ua.goit.java.restaurant.service.OrderService;

import java.util.List;

public class MenuForm {
    private long id;
    private String name;
    private List<String> dishes;
    private String photo;
    private Boolean save;
    private Boolean delete;

    public Boolean getDelete() {
        return delete;
    }

    public void setDelete(Boolean delete) {
        this.delete = delete;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getDishes() {
        return dishes;
    }

    public void setDishes(List<String> dishes) {
        this.dishes = dishes;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Boolean getSave() {
        return save;
    }

    public void setSave(Boolean save) {
        this.save = save;
    }

}
