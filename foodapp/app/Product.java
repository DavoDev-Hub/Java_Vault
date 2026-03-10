package foodapp.app;

public class Product {
    // atributos
    private final int id;
    private String name;
    private double price;
    private boolean available;

    // constructor
    public Product(int id, String name, double price, boolean available){
        this.id = id;
        this.name = name;
        this.price = price;
        this.available = available;
    }

    // metodos
    public final int getId(){ return id; }
    public String getName(){ return name; }
    public double getPrice(){ return price; }
    public boolean isAvailable(){ return available; } // (para booleans se usa "is...")


    public void markAsUnavailable(){ this.available = false; }
    public void markAsAvailable(){ this.available = true; }
    public void setPrice(double price){
        if(price < 0){
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;

    }
}
