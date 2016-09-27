package ua.goit.java.controllers;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by vvo12 on 24.09.2016.
 */
public interface Controller<T> {
    @Transactional
    void save(T o);

    @Transactional
    List<T> getAll();

    @Transactional
    T getById(Long id);

    @Transactional
    void deleteAll();

    @Transactional
    void delete(T t);
}
