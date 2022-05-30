public class Copia extends Libros {

    private String idlibro;

    private Copia localizacion;

    public Copia(String idlibro, Copia localizacion, String nombre, String tipo, String editorial, int any, String autor) {
        super(nombre, tipo, editorial, any, autor);
        this.idlibro = idlibro;
        this.localizacion = localizacion;
    }

  

    public String getIdlibro() {
        return idlibro;
    }

    public void setIdlibro(String idlibro) {
        this.idlibro = idlibro;
    }

    public Copia getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(Copia localizacion) {
        this.localizacion = localizacion;
    }

    @Override
    public String toString() {
        return "Copia{" + "idlibro=" + idlibro + ", localizacion=" + localizacion + '}';
    }
    
}
