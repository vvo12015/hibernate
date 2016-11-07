package ua.goit.java.restaurant.dao;

import java.util.List;

public interface BaseDao<T> {

    List<T> findAll();

    T load(Long id);

    void save(T o);

    void remove(T o);

    void removeAll();

    void update(T o);
}
