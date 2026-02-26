package biblioteca.admin;
import biblioteca.model.Libro;


public class LibroPremium extends Libro {
    private String edicionEspecial;

    //constructor de la clase
    public LibroPremium(String isbn, String titulo, String autor, int año,
                        int existencias, String edicionEspecial){
        super(isbn, titulo, autor, año, existencias);
        this.edicionEspecial = edicionEspecial;
    }

    // ✓ OK: protected desde subclase (paquete diferente)
    public void mostrarInformacionCompleta(){
        System.out.println("Autor: " + autor);   //protected
        actualizarExistencias(0);        //protected
        System.out.println("Edición: " + edicionEspecial);

    }
    // NO puede acceder:
    // isbn = "123"              // private ❌
    // validarISBN("123")        // private ❌
    // mostrarResumen()          // default ❌ (paquete diferente)
}
