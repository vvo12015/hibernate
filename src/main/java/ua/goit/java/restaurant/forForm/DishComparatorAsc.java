package ua.goit.java.restaurant.forForm;

import ua.goit.java.restaurant.model.Dish;

import java.util.Comparator;

public class DishComparatorAsc implements Comparator<Dish> {
    @Override
    public int compare(Dish d1, Dish d2) {
        return d1.getName().compareTo(d2.getName());
    }
}
