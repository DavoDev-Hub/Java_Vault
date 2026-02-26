package biblioteca.app;
import biblioteca.model.Libro;
import biblioteca.model.GestorInventario;
import biblioteca.admin.LibroPremium;

public class MainApp {
    public static void main(String[] args){
        System.out.println("=== DEMOSTRACIÓN ESPECIFICADORES DE ACCESO ===\n");

        // Crear libro
        Libro libro1 = new Libro("9781234567890", "Java POO", "Juan Pérez", 2026, 5);

        // PUBLIC: funciona desde cualquier paquete
        System.out.print("Año: ");
        libro1.añoPublicacion = 2026;
        System.out.println(libro1.añoPublicacion);

        libro1.prestarLibro();
        libro1.devolverLibro();

        // PRIVATE: ERROR DE COMPILACIÓN
        // libro1.isbn = "1234567890123";
        // libro1.validarISBN("123");

        // DEFAULT: ERROR DE COMPILACIÓN
        // libro1.titulo = "Nuevo título";
        // libro1.mostrarResumen();

        // PROTECTED: ERROR DE COMPILACIÓN (no es subclase)
        // libro1.autor = "Otro autor";
        // libro1.actualizarExistencias(10);

        System.out.println("\n=== GESTOR INVENTARIO (mismo paquete model) ===");
        GestorInventario gestor = new GestorInventario();
        gestor.agregarLote(libro1, 10);

        System.out.println("\n=== LIBRO PREMIUM (subclase) ===");
        LibroPremium premium = new LibroPremium("9780987654321", "Java Avanzado",
                "Ana García", 2025, 3, "Edición Coleccionista");
        premium.mostrarInformacionCompleta();  // Usa protected del padre

        System.out.println("\n=== RESUMEN DE ACCESOS ===");
        System.out.println("public: funciona desde CUALQUIER lugar");
        System.out.println("protected: mismo paquete O subclases");
        System.out.println("default: SOLO mismo paquete");
        System.out.println("private: SOLO misma clase");
    }
}
