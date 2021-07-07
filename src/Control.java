public class Control extends Programare {

    private int nrCabinet;
    private Doctor doctor;
    private double pret;


    public Control () {

    }

    public Control (String idProgramare, String dataProgramare, String oraProgramare, Pacient pacient, int nrCabinet, Doctor doctor,
                    double pret) {
        super(idProgramare, dataProgramare, oraProgramare, pacient);
        this.nrCabinet = nrCabinet;
        this.doctor = doctor;
        this.pret = pret;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public double getPret() {
        return pret;
    }

    public void setNrCabinet(int nrCabinet) {
        this.nrCabinet = nrCabinet;
    }

    public int getNrCabinet() {
        return nrCabinet;
    }
}
