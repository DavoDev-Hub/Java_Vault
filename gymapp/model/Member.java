package gymapp.model;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private static int idCounter = 0;
    private final int id;
    private String name;
    private List<Subscription> suscriptions;

    public Member(String name){
        this.id = ++idCounter;
        this.name = name;
        this.suscriptions = new ArrayList<>();
    }


}

