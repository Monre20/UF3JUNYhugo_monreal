package CodiUML;

public class ORDINADORS {

    private int idOrdinadors;

    public boolean protafegirPc(int numMax) {
        throw new UnsupportedOperationException("Not supported yet.");
        
        
    }

    public ORDINADORS(int idOrdinadors) {
        this.idOrdinadors = idOrdinadors;
    }

    public int getIdOrdinadors() {
        return idOrdinadors;
    }

    public void setIdOrdinadors(int idOrdinadors) {
        this.idOrdinadors = idOrdinadors;
    }

    @Override
    public String toString() {
        return "ORDINADORS{" + "idOrdinadors=" + idOrdinadors + '}';
    }
    
}
