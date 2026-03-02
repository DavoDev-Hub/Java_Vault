package empresa;

public class Empleado {

    // 🔹 Atributos (Encapsulación)
    private String nombre;
    private double salario;
    private final int id; // final → no cambia

    private static int contadorEmpleados = 0; // static → compartido

    // 🔹 Constructor
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
        contadorEmpleados++;
        this.id = contadorEmpleados;
    }

    // 🔹 Métodos públicos (getters)
    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public int getId() {
        return id;
    }

    // 🔹 Método para aumentar salario
    public void aumentarSalario(double porcentaje) {
        salario += salario * porcentaje / 100;
    }

    // 🔹 Método static
    public static int getTotalEmpleados() {
        return contadorEmpleados;
    }

    // 🔹 Método para mostrar información
    public void mostrarInfo() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + salario);
    }

    // 🔹 Clase Anidada (Nested Class)
    public static class Departamento {
        private String nombreDepto;
        private String ubicacion;

        public Departamento(String nombreDepto, String ubicacion) {
            this.nombreDepto = nombreDepto;
            this.ubicacion = ubicacion;
        }

        public void mostrarDepartamento() {
            System.out.println("Departamento: " + nombreDepto);
            System.out.println("Ubicación: " + ubicacion);
        }
    }
}