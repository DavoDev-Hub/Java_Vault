package poo;

public class Heroe {

    private String nombre;
    private int vida;
    private int daño;

    public Heroe(String nombre, int vida, int daño) {
        this.nombre = nombre;
        this.vida = vida;
        this.daño = daño;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public int getDaño() {
        return daño;
    }

    public void atacar() {
        System.out.println(nombre + " ataca causando " + daño + " de daño.");
    }

    public void habilidadEspecial() {
        System.out.println(nombre + " usa una habilidad especial.");
    }

    public void mostrarInfo() {
        System.out.println("Heroe: " + nombre);
        System.out.println("Vida: " + vida);
        System.out.println("Daño: " + daño);
    }
}