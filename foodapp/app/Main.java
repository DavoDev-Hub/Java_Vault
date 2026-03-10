package foodapp.app;

import foodapp.config.AppConfig;
import foodapp.model.Customer;
import foodapp.model.Order;
import foodapp.model.Product;
import foodapp.service.OrderService;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to " + AppConfig.getAppName());

        OrderService service = new OrderService();

        Product burger = new Product(1, "Burger", 10);
        Product pizza = new Product(2, "Pizza", 12);
        Product soda = new Product(3, "Soda", 3);

        service.addProduct(burger);
        service.addProduct(pizza);
        service.addProduct(soda);

        Customer carlos = new Customer("Carlos");

        service.registerCustomer(carlos);

        service.showMenu();

        Order order = service.createOrder(carlos);

        service.addProductToOrder(order, burger);
        service.addProductToOrder(order, soda);

        service.completeOrder(order);

        System.out.println(
                "\nTotal: "
                        + order.getTotal()
                        + " "
                        + AppConfig.getCurrency()
        );

    }

}