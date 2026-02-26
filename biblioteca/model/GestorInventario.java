package biblioteca.model;

public class GestorInventario {
    public void agregarLote(Libro libro, int cantidad){

        // OK: default (mismo paquete)
        libro.mostrarResumen();

        // OK: public
        libro.existencias += cantidad;

        // ✓ OK: protected (mismo paquete)
        // libro.actualizarExistencias(cantidad); // También funciona

        System.out.println("Lote agregado al inventario");
    }
    // NO puede acceder a:
    // libro.isbn = "123"         // private
    // libro.validarISBN("123")   // private
}
