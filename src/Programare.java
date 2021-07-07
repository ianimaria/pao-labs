import javax.xml.crypto.Data;
import java.util.Calendar;

public class Programare {

    private String idProgramare;
    private String dataProgramare;
    private String oraProgramare;
    private Pacient pacient;

    public Programare() {

    }

    public Programare(String idProgramare, String dataProgramare, String oraProgramare, Pacient pacient) {
        this.idProgramare = idProgramare;
        this.dataProgramare = dataProgramare;
        this.oraProgramare = oraProgramare;
        this.pacient = pacient;
    }

    public String getIdProgramare() {
        return idProgramare;
    }

    public void setIdProgramare(String idProgramare) {
        this.idProgramare = idProgramare;
    }

    public String getDataProgramare() {
        return dataProgramare;
    }

    public void setDataProgramare(String dataProgramare) {
        this.dataProgramare = dataProgramare;
    }

    public void setOraProgramare(String oraProgramare) {
        this.oraProgramare = oraProgramare;
    }

    public String getOraProgramare() {
        return oraProgramare;
    }

    public void setPacient(Pacient pacient) {
        this.pacient = pacient;
    }

    public Pacient getPacient() {
        return pacient;
    }

    @Override
    public String toString() {
        return "Programare{" +
                "idProgramare='" + idProgramare + '\'' +
                ", dataProgramare='" + dataProgramare + '\'' +
                ", oraProgramare='" + oraProgramare + '\'' +
                ", pacient=" + pacient.getCnp() +
                '}';
    }
}
