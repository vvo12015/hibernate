package ua.goit.java.restaurant.forForm;

import ua.goit.java.restaurant.model.Dish;

import java.util.Comparator;

public class DishComparatorAsc implements Comparator<Dish> {
    @Override
    public int compare(Dish o1, Dish o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
