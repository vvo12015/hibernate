package ua.goit.java.restaurant.model;

import ua.goit.java.restaurant.Position;

import javax.persistence.Entity;

@Entity
public class Waiter extends Employee{

    public Waiter() {
    }

    public Waiter(String name, String surName, String phoneNumber, Float salary) {
        super(name, surName, phoneNumber, Position.WAITER, salary);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Waiter {\n");
        sb.append("    id = ").append(getId()).append("\n");
        sb.append("    name = ").append(getName()).append("\n");
        sb.append("    surname = ").append(getSurName()).append("\n");
        sb.append("     }\n");
        sb.append("}\n");
        return sb.toString();
    }
}
