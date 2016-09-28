package ua.goit.java.restaurant.service;

import org.springframework.transaction.annotation.Transactional;
import ua.goit.java.restaurant.dao.BaseDao;

import java.util.List;

class AbstractService<T, D extends BaseDao<T>> implements Service<T> {
    protected D dao;

    @Override
    @Transactional
    public void save(T e){
        dao.save(e);
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
