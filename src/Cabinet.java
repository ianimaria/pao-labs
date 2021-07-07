import java.util.Arrays;

public class Cabinet {

// aici am lista cu toti doctorii, toti pacientii si toate programarile
    private Doctor[] doctori;
    private Pacient[] pacienti;
    private Programare[] programari;
    private Prescriptie[] prescriptii;

    public Cabinet() {
    }

    public Cabinet(Doctor[] doctori, Pacient[] pacienti, Programare[] programari) {
        this.doctori = doctori;
        this.pacienti = pacienti;
        this.programari = programari;
    }
    public void setDoctori(Doctor[] doctori) {
        this.doctori = doctori;
    }

    public Doctor[] getDoctori() {
        return doctori;
    }

    public void setPacienti(Pacient[] pacienti) {
        this.pacienti = pacienti;
    }

    public Pacient[] getPacienti() {
        return pacienti;
    }

    public void setProgramari(Programare[] programari) {
        this.programari = programari;
    }

    public Programare[] getProgramari() {
        return programari;
    }

    public void setPrescriptii(Prescriptie[] prescriptii) {
        this.prescriptii = prescriptii;
    }

    public Prescriptie[] getPrescriptii() {
        return prescriptii;
    }

    @Override
    public String toString() {
        return "Cabinet{" +
                "doctori=" + Arrays.toString(doctori) +
                ", pacienti=" + Arrays.toString(pacienti) +
                ", programari=" + Arrays.toString(programari) +
                ", prescriptii=" + Arrays.toString(prescriptii) +
                '}';
    }
}
