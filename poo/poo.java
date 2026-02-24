package poo;

class Estudiante {
    private static final double NOTA_MINIMA = 0.0;
    private static final double NOTA_MAXIMA = 10.0;
    private static final double NOTA_APROBACION = 6.0;

    private final String nombre;
    private final int edad;
    private final double calificacion;

    public Estudiante(String nombre, int edad, double calificacion) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar vacio.");
        }
        if (edad <= 0) {
            throw new IllegalArgumentException("La edad debe ser mayor que 0.");
        }
        if (calificacion < NOTA_MINIMA || calificacion > NOTA_MAXIMA) {
            throw new IllegalArgumentException("La calificacion debe estar entre 0 y 10.");
        }

        this.nombre = nombre.trim();
        this.edad = edad;
        this.calificacion = calificacion;
    }

    public boolean aprobo() {
        return calificacion >= NOTA_APROBACION;
    }

    public String estadoAcademico() {
        return aprobo() ? "Aprobado" : "Reprobado";
    }

    public void mostrarInfo() {
        System.out.printf("Nombre: %s%n", nombre);
        System.out.printf("Edad: %d%n", edad);
        System.out.printf("Calificacion: %.1f%n", calificacion);
        System.out.printf("Estado: %s%n", estadoAcademico());
    }
}

public class poo {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Ana", 20, 8.5);
        Estudiante estudiante2 = new Estudiante("Carlos", 22, 5.0);

        estudiante1.mostrarInfo();
        System.out.println();

        estudiante2.mostrarInfo();
    }
}
