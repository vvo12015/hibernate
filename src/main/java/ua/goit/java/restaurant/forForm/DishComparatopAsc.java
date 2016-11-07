package ua.goit.java.restaurant.forForm;

import ua.goit.java.restaurant.model.Dish;

import java.util.Comparator;

/**
 * Created by vvo12 on 07.11.2016.
 */
public class DishComparatopAsc implements Comparator<Dish> {
    @Override
    public int compare(Dish o1, Dish o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
