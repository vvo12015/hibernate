package ua.goit.java.model;

import ua.goit.java.Position;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Waiter extends Employee{

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "employee_id")
    private List<Orders> orders;

    public Waiter() {
    }

    public Waiter(String name, String surName, String phoneNumber, Float salary) {
        super(name, surName, phoneNumber, Position.WAITER, salary);
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Waiter {\n");
        sb.append("     id = ").append(getId()).append("\n");
        sb.append("     name = ").append(getName()).append("\n");
        sb.append("     surname = ").append(getSurName()).append("\n");
        sb.append("     orders = {\n");
        orders.forEach(order -> sb.append("     ").append(order).append("\n"));
        sb.append("     }\n");
        sb.append("}\n");
        return sb.toString();
    }
}
