public class Prestamo {

    private int fechainicio;

    private int fechaFinal;

    private String idPrestamo;

    public Prestamo(int fechainicio, int fechaFinal, String idPrestamo) {
        this.fechainicio = fechainicio;
        this.fechaFinal = fechaFinal;
        this.idPrestamo = idPrestamo;
    }

    public int getFechainicio() {
        return fechainicio;
    }

    public int getFechaFinal() {
        return fechaFinal;
    }

    public String getIdPrestamo() {
        return idPrestamo;
    }

    public void setFechainicio(int fechainicio) {
        this.fechainicio = fechainicio;
    }

    public void setFechaFinal(int fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public void setIdPrestamo(String idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "fechainicio=" + fechainicio + ", fechaFinal=" + fechaFinal + ", idPrestamo=" + idPrestamo + '}';
    }
    
}
