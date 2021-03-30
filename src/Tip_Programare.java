public class Tip_Programare {

    private String descriere_programare;
    private double durata_programare;

    public Tip_Programare() {

    }

    public Tip_Programare(String descriere_programare, double durata_programare) {
        this.descriere_programare = descriere_programare;
        this.durata_programare = durata_programare;
    }
    public Tip_Programare(Tip_Programare tip) {
        this.descriere_programare = tip.getDescriere_programare();
        this.durata_programare = tip.getDurata_programare();

    }
    public Tip_Programare(String string1, String string2) {
        this.descriere_programare = string1;
        this.durata_programare = Integer.parseInt(string2);
    }

    public void setDescriere_programare(String descriere_programare) {
        this.descriere_programare = descriere_programare;
    }

    public void setDurata_programare(double durata_programare) {
        this.durata_programare = durata_programare;
    }

    public String getDescriere_programare() {
        return descriere_programare;
    }

    public double getDurata_programare() {
        return durata_programare;
    }


}
