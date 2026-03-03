package animals;


class Animal{
    public String name;
    public int age;
    public String type;

    public void MostrarInfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(type);
    }
}


public class MainAnimals {
    public static void main(String[] args) {
        Animal dog1 = new Animal();
        dog1.name = "Pedro";
        dog1.age = 12;
        dog1.type = "dog";
        dog1.MostrarInfo();
    }
}
