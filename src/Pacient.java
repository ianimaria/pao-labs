public class Pacient extends Persoana {

    private String diagnostic;
    private Boolean tratat;

    public Pacient() {

    }

    public Pacient(String nume, String prenume, String cnp, int varsta, String nrTelefon, String diagnostic, Boolean tratat) {
        super(nume,prenume,cnp,varsta,nrTelefon);
        this.diagnostic = diagnostic;
        this.tratat = tratat;
    }


    public String getDiagnostic() {
        return this.diagnostic;
    }

    public Boolean getTratat() {
        return tratat;
    }


    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    public void setTratat(Boolean tratat) {
        this.tratat = tratat;
    }

    @Override
    public String toString() {
        return super.toString() + ", cu diagnosticul " + diagnostic;
    }
}
