package ua.goit.java.dao;

import ua.goit.java.model.Orders;
import ua.goit.java.model.Waiter;

import java.util.List;

public interface OrderDao extends BaseDao<Orders> {

    List<Orders> findByWaiterName(Waiter waiter);
}
