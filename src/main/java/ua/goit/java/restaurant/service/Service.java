package ua.goit.java.restaurant.service;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface Service<T> {
    @Transactional
    void save(T e);

    @Transactional
    List<T> getAll();

    @Transactional
    T getById(Long id);

    @Transactional
    void deleteAll();

    @Transactional
    void delete(T t);
}
