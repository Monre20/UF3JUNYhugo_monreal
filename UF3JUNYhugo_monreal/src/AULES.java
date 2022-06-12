
import java.util.ArrayList;

public class AULES {

    private String nomAula;

    private int capacitatMaxAlumn;

    private ArrayList aules;

    public AULES(String nomAula, int capacitatMaxAlumn, ArrayList aules) {
        this.nomAula = nomAula;
        this.capacitatMaxAlumn = capacitatMaxAlumn;
        this.aules = aules;
    }

    public String getNomAula() {
        return nomAula;
    }

    public void setNomAula(String nomAula) {
        this.nomAula = nomAula;
    }

    public int getCapacitatMaxAlumn() {
        return capacitatMaxAlumn;
    }

    public void setCapacitatMaxAlumn(int capacitatMaxAlumn) {
        this.capacitatMaxAlumn = capacitatMaxAlumn;
    }

    public ArrayList getAules() {
        return aules;
    }

    public void setAules(ArrayList aules) {
        this.aules = aules;
    }

    @Override
    public String toString() {
        return "AULES{" + "nomAula=" + nomAula + ", capacitatMaxAlumn=" + capacitatMaxAlumn + ", aules=" + aules + '}';
    }

   
    
    

    public boolean protafegirAlumne(int numMax) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
