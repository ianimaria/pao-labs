public class Prescriptie {

    private int nrPrescriptie;
    private String cnpPacient;
    private String numeDoctor;
    private String reteta;
    private double pret;

    public Prescriptie() {

    }

    public Prescriptie(int nrPrescriptie, String cnpPacient, String numeDoctor, String reteta, double pret) {
        this.nrPrescriptie = nrPrescriptie;
        this.cnpPacient = cnpPacient;
        this.numeDoctor = numeDoctor;
        this.reteta = reteta;
        this.pret = pret;
    }

    public void setNrPrescriptie(int nrPrescriptie) {
        this.nrPrescriptie = nrPrescriptie;
    }

    public int getNrPrescriptie() {
        return nrPrescriptie;
    }

    public void setCnpPacient(String cnpPacient) {
        this.cnpPacient = cnpPacient;
    }

    public String getCnpPacient() {
        return cnpPacient;
    }

    public void setNumeDoctor(String numeDoctor) {
        this.numeDoctor = numeDoctor;
    }

    public String getNumeDoctor() {
        return numeDoctor;
    }

    public void setReteta(String reteta) {
        this.reteta = reteta;
    }

    public String getReteta() {
        return reteta;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public double getPret() {
        return pret;
    }

    @Override
    public String toString() {
        return "Prescriptie{" +
                "nrPrescriptie=" + nrPrescriptie +
                ", cnpPacient='" + cnpPacient + '\'' +
                ", numeDoctor='" + numeDoctor + '\'' +
                ", reteta='" + reteta + '\'' +
                ", pret=" + pret +
                '}';
    }
}
