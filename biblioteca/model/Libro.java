package biblioteca.model;

public class Libro {
    private String isbn;
    String titulo;
    protected String autor;
    public int añoPublicacion;
    public int existencias;

    // Constructor de la clase Libro
    public Libro(String isbn, String titulo, String autor, int añoPublicacion, int existencias){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.existencias = existencias;
    }

    private void validarISBN(String isbn){
        if(isbn.length() != 13){
            System.out.println("ISBN debe tener 13 digitos");
        }
    }

    void mostrarResumen(){
        System.out.println("Resumen: " + titulo+ "por "+ autor);
    }

    protected void actualizarExistencias(int cantidad){
        this.existencias += cantidad;
        System.out.println("Existencias actualizadas "+ existencias);
    }

    public boolean prestarLibro(){
        if(existencias > 0){
            existencias--;
            System.out.println("Libro prestado correctamente");
            return true;
        } else{
            System.out.println("No hay existencias");
            return false;
        }
    }

    public void devolverLibro(){
        existencias++;
        System.out.println("Libro devuelto");
    }
}
