package gymapp.model;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private static int idCounter = 0;
    private final int id;
    private String name;
    private List<Subscription> subscriptions;

    public Member(String name){
        this.id = ++idCounter;
        this.name = name;
        this.subscriptions = new ArrayList<>();
    }

    public int getId(){ return id; }

    public String getName(){ return name; }

    public void addOrder(Subscription subscription){ subscriptions.add(subscription); }

    public List<Subscription> getSubscriptions(){ return subscriptions; }

}

