public class Pacient {

    private String nume_pacient;
    private String prenume_pacient;
    private String diagnostic;
    private String doctor;

    public Pacient() {
        this.nume_pacient = "";
        this.prenume_pacient = "";
        this.diagnostic = "";
        this.doctor = "";
    }

    public Pacient(String nume_pacient, String prenume_pacient) {
        this.nume_pacient = nume_pacient;
        this.prenume_pacient = prenume_pacient;
        this.diagnostic = "-";
        this.doctor = "";
    }

    public Pacient(String nume_pacient, String prenume_pacient, String diagnostic, String doctor) {
        this.nume_pacient = nume_pacient;
        this.prenume_pacient = prenume_pacient;
        this.diagnostic = diagnostic;
        this.doctor = doctor;
    }

    public String getNume_pacient() {
        return this.nume_pacient;
    }

    public String getPrenume_pacient() {
        return this.prenume_pacient;
    }

    public String getDiagnostic() {
        return this.diagnostic;
    }

    public String getDoctor() {
        return this.doctor;
    }

    public void setNume_pacient(String nume_pacient) {
        this.nume_pacient = nume_pacient;
    }

    public void setPrenume_pacient(String prenume_pacient) {
        this.prenume_pacient = prenume_pacient;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

}
