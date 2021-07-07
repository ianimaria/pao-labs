import java.util.Arrays;
import java.util.List;

public class Doctor extends Persoana {

    private double salariu;
    private Pacient[] pacienti;
    private Programare[] programari;
//   private List<Pacient> pacienti = new ArrayList<>();
//    private List<Programare> programari = new ArrayList<>();


    public Doctor() {

    }
    public Doctor(String nume, String prenume, String cnp, int varsta, String nrTelefon, double salariu,
            Pacient[] pacienti, Programare[] programari) {
        super(nume, prenume, cnp, varsta, nrTelefon);
        this.salariu = salariu;
        this.pacienti = pacienti;
        this.programari = programari;
    }

    public void setSalariu(double salariu) {
        this.salariu = salariu;
    }

    public double getSalariu() {
        return salariu;
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


}
