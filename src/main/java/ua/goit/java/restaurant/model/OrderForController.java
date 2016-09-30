package ua.goit.java.restaurant.model;

public class OrderForController {
    private String waiterName;
    private int tableNumber;

    public OrderForController(String waiterName, int tableNumber) {
        this.waiterName = waiterName;
        this.tableNumber = tableNumber;
    }

    public String getWaiterName() {
        return waiterName;
    }

    public void setWaiterName(String waiterName) {
        this.waiterName = waiterName;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }
}
