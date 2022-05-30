public class Autor {

    private String nombre;

    private String nacionalidad;

    private int fechaNacimiento;

    public Autor(String nombre, String nacionalidad, int fechaNacimiento) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
        
        
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Autor{" + "nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
    
}
