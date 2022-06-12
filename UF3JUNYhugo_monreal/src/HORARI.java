public class HORARI {

    private String diaSetmana;

    private String horaInici;

    private String horaFi;

    public HORARI(String diaSetmana, String horaInici, String horaFi) {
        this.diaSetmana = diaSetmana;
        this.horaInici = horaInici;
        this.horaFi = horaFi;
    }

    public String getDiaSetmana() {
        return diaSetmana;
    }

    public void setDiaSetmana(String diaSetmana) {
        this.diaSetmana = diaSetmana;
    }

    public String getHoraInici() {
        return horaInici;
    }

    public void setHoraInici(String horaInici) {
        this.horaInici = horaInici;
    }

    public String getHoraFi() {
        return horaFi;
    }

    public void setHoraFi(String horaFi) {
        this.horaFi = horaFi;
    }

    @Override
    public String toString() {
        return "HORARI{" + "diaSetmana=" + diaSetmana + ", horaInici=" + horaInici + ", horaFi=" + horaFi + '}';
    }
    
    
}
