
import java.util.List;

public class Lector {

    private String nombre;

    private String DNI;

    private List idPrestamo;

    private int numeroMaximoPrestamos;

    public Lector(String nombre, String DNI, List idPrestamo, int numeroMaximoPrestamos) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.idPrestamo = idPrestamo;
        this.numeroMaximoPrestamos = numeroMaximoPrestamos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public List getIdPrestamo() {
        return idPrestamo;
    }

    public int getNumeroMaximoPrestamos() {
        return numeroMaximoPrestamos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setIdPrestamo(List idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public void setNumeroMaximoPrestamos(int numeroMaximoPrestamos) {
        this.numeroMaximoPrestamos = numeroMaximoPrestamos;
    }

    @Override
    public String toString() {
        return "Lector{" + "nombre=" + nombre + ", DNI=" + DNI + ", idPrestamo=" + idPrestamo + ", numeroMaximoPrestamos=" + numeroMaximoPrestamos + '}';
    }
    
    
}
