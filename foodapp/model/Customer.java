package foodapp.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private static int idCounter = 0;
    private final int id;
    private String name;
    private List<Order> orders;

    public Customer(String name){
        this.id = ++idCounter;
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public int getId(){ return id; }
    public String getName(){ return name; }
    public void addOrder(Order order){ orders.add(order); }
    public List<Order> getOrders(){ return orders; }

}
