public class Programare {

    private int nr_programare;
    private double pret_programare;
    private Tip_Programare tip_programare;

    public Programare() {

    }

    public Programare(int nr_programare, double pret_programare) {
        this.nr_programare = nr_programare;
        this.pret_programare = pret_programare;
    }

    public Programare(int nr_programare, double pret_programare, Tip_Programare tip_programare) {
        this.nr_programare = nr_programare;
        this.pret_programare = pret_programare;
        this.tip_programare = tip_programare;
    }

    public int getNr_programare() {
        return nr_programare;
    }

    public void setNr_programare(int nr_programare) {
        this.nr_programare = nr_programare;
    }

    public double getPret_programare() {
        return getPret_programare();
    }

    public void setPret_programare(double pret_programare) {
        this.pret_programare = pret_programare;
    }

    public Tip_Programare getTip_programare() {
        return tip_programare;
    }

    public void setTip_programare(Tip_Programare tip_programare) {
        this.tip_programare = tip_programare;
    }
}
