package foodapp.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private static int orderCounter = 0;

    private final int orderId;
    private Customer customer;
    private List<Product> products;
    private double total;
    private OrderStatus status;

    public Order(Customer customer){
        this.orderId = ++orderCounter;
        this.customer = customer;
        this.products = new ArrayList<>();
        this.status = OrderStatus.CREATED;
    }

    public int getOrderId() { return orderId; }
    public OrderStatus getStatus(){ return status; }

    public void addProduct(Product product){
        if(!product.isAvailable()){
            throw new IllegalArgumentException("Product not available");
        }
        products.add(product);
        product.markAsAvailable();
        calculateTotal();
    }

    private void calculateTotal(){
        total = 0;

        for(Product p : products){
            total += p.getPrice();
        }
    }

    public double getTotal(){
        return total;
    }
    public void closeOrder() {
        this.status = OrderStatus.DELIVERED;
    }
    public List<Product> getProducts(){
        return products;
    }
}
