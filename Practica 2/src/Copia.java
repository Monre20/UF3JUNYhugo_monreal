public class Copia extends Libros {

    private String idlibro;

    private Copia localizacion;

    public Copia(String nombre, String tipo, String editorial, int any, String autor) {
        super(nombre, tipo, editorial, any, autor);
        
    }

    public String getIdlibro() {
        return idlibro;
    }

    public Copia getLocalizacion() {
        return localizacion;
    }

    public void setIdlibro(String idlibro) {
        this.idlibro = idlibro;
    }

    public void setLocalizacion(Copia localizacion) {
        this.localizacion = localizacion;
    }

    @Override
    public String toString() {
        return "Copia{" + "idlibro=" + idlibro + ", localizacion=" + localizacion + '}';
    }
    
}
