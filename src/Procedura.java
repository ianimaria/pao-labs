public class Procedura extends Programare {

    private String durata;
    private String dificultate;

    public Procedura() {

    }

    public Procedura(String idProgramare, String dataProgramare, String oraProgramare, Pacient pacient, String durata,
                     String dificultate) {
        super(idProgramare, dataProgramare, oraProgramare, pacient);
        this.durata = durata;
        this.dificultate = dificultate;
    }

    public void setDurata(String durata) {
        this.durata = durata;
    }

    public String getDurata() {
        return durata;
    }

    public void setDificultate(String dificultate) {
        this.dificultate = dificultate;
    }

    public String getDificultate() {
        return dificultate;
    }
}
