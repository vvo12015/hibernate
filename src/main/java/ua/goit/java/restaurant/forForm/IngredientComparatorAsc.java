package ua.goit.java.restaurant.forForm;

import ua.goit.java.restaurant.model.Ingredient;

import java.util.Comparator;

public class IngredientComparatorAsc implements Comparator<Ingredient> {
    @Override
    public int compare(Ingredient o1, Ingredient o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
