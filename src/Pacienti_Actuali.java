import java.util.ArrayList;
import java.util.List;

public class Pacienti_Actuali extends Pacient {

    private List<String> pacienti_actuali = new ArrayList<>();

    public Pacienti_Actuali(String nume_pacient, String prenume_pacient, String diagnostic, String doctor) {
        super(nume_pacient, prenume_pacient, diagnostic, doctor);
    }

    public int getNrpacienti_actuali() {
        return pacienti_actuali.size();
    }

}
