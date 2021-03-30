public class Prescriptie {

    private String denumire_prescriptie;
    private String prospect;
    private String afectiune;

    public Prescriptie() {
        this.denumire_prescriptie = "";
        this.prospect = "";
        this.afectiune = "";
    }

    public Prescriptie(String denumire_prescriptie, String prospect, String afectiune) {
        this.denumire_prescriptie = denumire_prescriptie;
        this.prospect = prospect;
        this.afectiune = afectiune;
    }

    public void setDenumire_prescriptie(String denumire_prescriptie) {
        this.denumire_prescriptie = denumire_prescriptie;
    }

    public void setProspect(String prospect) {
        this.prospect = prospect;
    }

    public void setAfectiune(String afectiune) {
        this.afectiune = afectiune;
    }

    public String getDenumire_prescriptie() {
        return denumire_prescriptie;
    }

    public String getProspect() {
        return prospect;
    }

    public String getAfectiune() {
        return afectiune;
    }
}
