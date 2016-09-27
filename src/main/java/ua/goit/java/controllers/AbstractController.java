package ua.goit.java.controllers;

import org.springframework.transaction.annotation.Transactional;
import ua.goit.java.dao.BaseDao;

import java.util.List;

public class AbstractController<T, D extends BaseDao<T>> implements Controller<T> {
    protected D dao;

    @Override
    @Transactional
    public void save(T o){
        dao.save(o);
    }

    @Override
    @Transactional
    public T getById(Long id){
        return dao.load(id);
    }

    @Override
    @Transactional
    public List<T> getAll(){
        return dao.findAll();
    }

    @Override
    public void delete(T t) {
    }

    @Override
    @Transactional
    public void deleteAll() {
        dao.removeAll();
    }

    public void setDao(D dao) {
        this.dao = dao;
    }
}
