package poo;

class Estudiante {

    private String nombre;
    private int edad;
    private double calificacion;

    // Constructor
    public Estudiante(String nombre, int edad, double calificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = calificacion;
    }

    // Método para saber si aprobó
    public boolean aprobo() {
        return calificacion >= 6;
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Calificación: " + calificacion);
    }
}

public class poo {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Ana", 20, 8.5);
        Estudiante estudiante2 = new Estudiante("Carlos", 22, 5.0);

        estudiante1.mostrarInfo();
        System.out.println("¿Aprobó? " + estudiante1.aprobo());
        System.out.println();

        estudiante2.mostrarInfo();
        System.out.println("¿Aprobó? " + estudiante2.aprobo());
    }
}
