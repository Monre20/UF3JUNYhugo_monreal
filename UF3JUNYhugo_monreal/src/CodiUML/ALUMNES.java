package CodiUML;

public class ALUMNES extends PERSONA {

    private String dataNeixement;

    private int codiCicle;

    private int idAlumne;

    public ALUMNES(String dataNeixement, int codiCicle, int idAlumne) {
        this.dataNeixement = dataNeixement;
        this.codiCicle = codiCicle;
        this.idAlumne = idAlumne;
    }

    public String getDataNeixement() {
        return dataNeixement;
    }

    public void setDataNeixement(String dataNeixement) {
        this.dataNeixement = dataNeixement;
    }

    public int getCodiCicle() {
        return codiCicle;
    }

    public void setCodiCicle(int codiCicle) {
        this.codiCicle = codiCicle;
    }

    public int getIdAlumne() {
        return idAlumne;
    }

    public void setIdAlumne(int idAlumne) {
        this.idAlumne = idAlumne;
    }

    @Override
    public String toString() {
        return "ALUMNES{" + "dataNeixement=" + dataNeixement + ", codiCicle=" + codiCicle + ", idAlumne=" + idAlumne + '}';
    }
    
}
