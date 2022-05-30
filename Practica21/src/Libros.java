public class Libros {

    private String nombre;

    private String tipo;

    private String editorial;

    private int any;

    private String autor;

    public Libros(String nombre, String tipo, String editorial, int any, String autor) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.editorial = editorial;
        this.any = any;
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libros{" + "nombre=" + nombre + ", tipo=" + tipo + ", editorial=" + editorial + ", any=" + any + ", autor=" + autor + '}';
    }
    
}
