package biblioteca.model;

public class Libro {
    // private: solo dentro de esta clase
    private String isbn;

    // default: solo dentro del mismo paquete
    String titulo;

    // protected: mismo paquete + subclases
    protected String autor;

    // public: desde cualquier lugar
    public int añoPublicacion;
    public int existencias;

    public Libro(String isbn, String titulo, String autor, int año, int existencias) {
        this.validarISBN(isbn);  // private method
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = año;
        this.existencias = existencias;
    }

    // private: solo dentro de esta clase
    private void validarISBN(String isbn) {
        if (isbn.length() != 13) {
            throw new IllegalArgumentException("ISBN debe tener 13 dígitos");
        }
    }

    // default: solo mismo paquete
    void mostrarResumen() {
        System.out.println("Resumen: " + titulo + " por " + autor);
    }

    // protected: mismo paquete + subclases
    protected void actualizarExistencias(int cantidad) {
        this.existencias += cantidad;
        System.out.println("Existencias actualizadas: " + existencias);
    }

    // public: desde cualquier lugar
    public boolean prestarLibro() {
        if (existencias > 0) {
            existencias--;
            System.out.println("✓ Libro prestado exitosamente");
            return true;
        } else {
            System.out.println("✗ No hay existencias");
            return false;
        }
    }

    public void devolverLibro() {
        existencias++;
        System.out.println("✓ Libro devuelto");
    }
}
