package ua.goit.java.restaurant.dao;

import ua.goit.java.restaurant.model.Orders;
import ua.goit.java.restaurant.model.Waiter;

import java.util.List;

public interface OrderDao extends BaseDao<Orders> {

    List<Orders> findByWaiterName(Waiter waiterForFind);
}
