package foodapp.service;

import foodapp.model.Customer;
import foodapp.model.Order;
import foodapp.model.Product;
import foodapp.model.*;

import java.util.ArrayList;
import java.util.List;

public class OrderService {

    private List<Product> products;
    private List<Customer> customers;
    private List<Order> orders;

    public OrderService() {
        products = new ArrayList<>();
        customers = new ArrayList<>();
        orders = new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void registerCustomer(Customer customer){
        customers.add(customer);
    }

    public Order createOrder(Customer customer){

        Order order = new Order(customer);

        orders.add(order);

        customer.addOrder(order);

        return order;
    }

    public void addProductToOrder(Order order, Product product){
        order.addProduct(product);
    }

    public void completeOrder(Order order){
        order.closeOrder();
    }

    public void showMenu(){

        System.out.println("MENU");

        for(Product p : products){

            if(p.isAvailable()){
                System.out.println(p.getId() + " - " + p.getName() + " : $" + p.getPrice());
            }

        }
    }

    public void showOrders(){

        for(Order o : orders){

            System.out.println("Order #" + o.getOrderId());
            System.out.println("Status: " + o.getStatus());
            System.out.println("Total: " + o.getTotal());

        }

    }

    // Nested class
    public static class SystemStatistics {

        public static void printStats(List<Product> products,
                                      List<Customer> customers,
                                      List<Order> orders){

            System.out.println("\nStatistics");
            System.out.println("Products: " + products.size());
            System.out.println("Customers: " + customers.size());
            System.out.println("Orders: " + orders.size());

        }

    }

    public List<Product> getProducts(){
        return products;
    }

    public List<Customer> getCustomers(){
        return customers;
    }

    public List<Order> getOrders(){
        return orders;
    }

}