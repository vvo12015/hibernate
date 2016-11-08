package ua.goit.java.restaurant.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "orders")
public class Orders {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee waiter;

    @ManyToMany(cascade = {CascadeType.DETACH}, fetch = FetchType.EAGER)
    @JoinTable(
            name = "dish_to_order",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "dish_id")
    )

    private List<Dish> dishes;

    @Column(name = "table_number")
    private int tableNumber;

    @Column(name = "order_date")
    private Date orderDate;

    public Orders(Waiter waiter, List<Dish> dishes, int tableNumber) {
        this.waiter = waiter;
        this.dishes = dishes;
        this.tableNumber = tableNumber;
        this.orderDate = new Date();
    }

    public Orders() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Employee getWaiter() {
        return waiter;
    }

    public void setWaiter(Employee waiter) {
        this.waiter = waiter;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Orders)) return false;

        Orders orders = (Orders) o;

        if (tableNumber != orders.tableNumber) return false;
        if (waiter != null ? !waiter.equals(orders.waiter) : orders.waiter != null) return false;
        if (dishes != null ? !dishes.equals(orders.dishes) : orders.dishes != null) return false;
        return orderDate != null ? orderDate.equals(orders.orderDate) : orders.orderDate == null;

    }

    @Override
    public int hashCode() {
        int result = waiter != null ? waiter.hashCode() : 0;
        result = 31 * result + (dishes != null ? dishes.hashCode() : 0);
        result = 31 * result + tableNumber;
        result = 31 * result + (orderDate != null ? orderDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id = " + id +
                ", dishes=" + dishes +
                ", tableNumber=" + tableNumber +
                ", orderDate=" + orderDate +
                '}';
    }
}
