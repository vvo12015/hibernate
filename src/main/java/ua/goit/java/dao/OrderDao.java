package ua.goit.java.dao;

import ua.goit.java.model.Orders;

import java.util.List;

public interface OrderDao extends BaseDao<Orders> {

    List<Orders> findByWaiterName(String waiterName);
}
