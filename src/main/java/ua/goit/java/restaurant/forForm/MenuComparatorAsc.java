package ua.goit.java.restaurant.forForm;

import ua.goit.java.restaurant.model.Menu;

import java.util.Comparator;

public class MenuComparatorAsc implements Comparator<Menu> {
    @Override
    public int compare(Menu o1, Menu o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
