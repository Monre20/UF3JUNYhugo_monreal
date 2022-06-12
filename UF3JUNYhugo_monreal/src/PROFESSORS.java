public class PROFESSORS extends PERSONA {

    private String departament;

    private String carrrec;

    private int idProfessor;

    public PROFESSORS(String departament, String carrrec, int idProfessor) {
        this.departament = departament;
        this.carrrec = carrrec;
        this.idProfessor = idProfessor;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public String getCarrrec() {
        return carrrec;
    }

    public void setCarrrec(String carrrec) {
        this.carrrec = carrrec;
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    @Override
    public String toString() {
        return "PROFESSORS{" + "departament=" + departament + ", carrrec=" + carrrec + ", idProfessor=" + idProfessor + '}';
    }
    
    
}
