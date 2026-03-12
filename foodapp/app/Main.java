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

        Product burger = new Product(12345, "Burger", 10);
        Product pizza = new Product(54321, "Pizza", 12);
        service.addProduct(burger);
        service.addProduct(pizza);

        Customer carlos = new Customer("Carlos");

        service.registerCustomer(carlos);

        service.showMenu();

        Order order = service.createOrder(carlos);

        service.addProductToOrder(order, burger);

        service.completeOrder(order);

        System.out.println(
                "\nTotal: "
                        + order.getTotal()
                        + " "
                        + AppConfig.getCurrency()
        );

    }

}