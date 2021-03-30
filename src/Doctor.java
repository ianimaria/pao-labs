import java.util.ArrayList;
import java.util.List;

public class Doctor {

    private String nume_doctor;
    private String prenume_doctor;
    private List<Programare> programari_curente = new ArrayList<>();

    public Doctor() {
        this.nume_doctor = "";
        this.prenume_doctor = "";
        this.programari_curente = null;
    }

    public Doctor(String nume_doctor, String prenume_doctor) {
        this.nume_doctor = nume_doctor;
        this.prenume_doctor = prenume_doctor;
    }

    public void adauga_programare(Programare programare) {
        programari_curente.add(programare);
//        System.out.println("Doctorul " + this.nume_doctor + " " + this.prenume_doctor + " are o noua programare: ");
//        System.out.println(this.programari_curente);
    }

    public Doctor(String nume_doctor, String prenume_doctor, List<Programare> programari_curente) {
        this.nume_doctor = nume_doctor;
        this.prenume_doctor = prenume_doctor;
        this.programari_curente = programari_curente;
    }

    public String getNume_doctor() {
        return nume_doctor;
    }

    public void setNume_doctor(String nume_doctor) {
        this.nume_doctor = nume_doctor;
    }

    public String getPrenume_doctor() {
        return prenume_doctor;
    }

    public void setPrenume_doctor(String prenume_doctor) {
        this.prenume_doctor = prenume_doctor;
    }

    public List<Programare> getProgramari_curente() {
        return programari_curente;
    }

    public void setProgramari_curente(List<Programare> programari_curente) {
        this.programari_curente = programari_curente;
    }
}
