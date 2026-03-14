package gymapp.model;

public class Plan {
    private final int id;
    private String name;
    private double price;
    private boolean available;

    public Plan(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public final int getId(){ return id; }

    public String getName(){ return name; }

    public double getPrice(){ return price; }

    public boolean isAvailable(){ return available; }

    public void markAsUnavailable(){ this.available = false; }

    public void markAsAvailable(){ this.available = true; }

}
