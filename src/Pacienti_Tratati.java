import java.util.ArrayList;
import java.util.List;

public class Pacienti_Tratati extends Pacient {

    private List<String> pacienti_tratati = new ArrayList<>();

    public Pacienti_Tratati(String nume_pacient, String prenume_pacient, String diagnostic, String doctor) {
        super(nume_pacient, prenume_pacient, diagnostic, doctor);
    }

}
