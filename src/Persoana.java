public class Persoana  {

    private String nume;
    private String prenume;
    private String cnp;
    private int varsta;
    private String nrTelefon;

    public Persoana () {

    }

    public Persoana(String nume, String prenume, String cnp, int varsta, String nrTelefon) {
        this.nume = nume;
        this.prenume = prenume;
        this.cnp = cnp;
        this.varsta = varsta;
        this.nrTelefon = nrTelefon;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public void setNrTelefon(String nrTelefon) {
        this.nrTelefon = nrTelefon;
    }

    @Override
    public String toString() {
        return "Nume: " + nume + ", Prenume: " + prenume + ", CNP: " + cnp + ", Varsta: " + varsta
                + ", Numar de telefon: " + nrTelefon;
    }


}

