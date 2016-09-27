package ua.goit.java.dao;

import java.util.List;

public interface BaseDao<T> {

    List<T> findAll();

    T load(Long id);

    void save(T o);

    void remove(T o);

    void removeAll();
}
