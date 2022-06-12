public abstract class PERSONA {

    private String nom;

    private String cognom;

    private String email;



    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "PERSONA{" + "nom=" + nom + ", cognom=" + cognom + ", email=" + email + '}';
    }
    
}
