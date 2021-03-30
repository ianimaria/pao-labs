import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cabinet_Medical {

    private String nume_cabinet;
    private String locatie_cabinet;

    private List<Object> doctori = new ArrayList<>();
    private List<Tip_Programare> tipuri_programari = new ArrayList<>();
    private List<Object> programari = new ArrayList<>();
    private List<Pacienti_Tratati> lista_pacienti_tratati = new ArrayList<>();
    private List<Object> lista_pacienti_actuali = new ArrayList<>();
    private List<Object> lista_medicamente = new ArrayList<>();

    public Cabinet_Medical() {
        this.nume_cabinet = "";
        this.locatie_cabinet = "";
    }
    public Cabinet_Medical(String nume_cabinet, String locatie_cabinet) {
        this.nume_cabinet = nume_cabinet;
        this.locatie_cabinet = locatie_cabinet;
    }

    public Cabinet_Medical(String nume_cabinet, String locatie_cabinet, List<Object> doctori, List<Tip_Programare> tipuri_programari,
                           List<Object> programari, List<Pacienti_Tratati> lista_pacienti_tratati,
                           List<Object> lista_pacienti_actuali, List<Object> lista_medicamente) {

        this.nume_cabinet = nume_cabinet;
        this.locatie_cabinet = locatie_cabinet;
        this.doctori = doctori;
        this.tipuri_programari = tipuri_programari;
        this.programari = programari;
        this.lista_pacienti_tratati = lista_pacienti_tratati;
        this.lista_pacienti_actuali = lista_pacienti_actuali;
        this.lista_medicamente = lista_medicamente;

    }

    public void setNume_cabinet(String nume_cabinet) {
        this.nume_cabinet = nume_cabinet;
    }

    public void setLocatie_cabinet(String locatie_cabinet) {
        this.locatie_cabinet = locatie_cabinet;
    }

    public void setDoctori(List<Object> lista_doctori) {
        this.doctori = doctori;
    }

    public void setTipuri_programari(List<Tip_Programare> tipuri_programari) {
        this.tipuri_programari = tipuri_programari;
    }

    public void setProgramari(List<Object> programari) {
        this.programari = programari;
    }

    public void setLista_pacienti_tratati(List<Pacienti_Tratati> lista_pacienti_tratati) {
        this.lista_pacienti_tratati = lista_pacienti_tratati;
    }

    public void setLista_pacienti_actuali(List<Object> lista_pacienti_actuali) {
        this.lista_pacienti_actuali = lista_pacienti_actuali;
    }

    public void setLista_medicamente(List<Object> lista_medicamente) {
        this.lista_medicamente = lista_medicamente;
    }

    public String getNume_cabinet() {
        return nume_cabinet;
    }

    public String getLocatie_cabinet() {
        return locatie_cabinet;
    }

    public void getDoctori() {
        for (int i=0; i< doctori.size(); i++){
            Doctor doc = (Doctor) doctori.get(i);
            System.out.println(doc.getNume_doctor() + ' ' + doc.getPrenume_doctor());
        }
    }

    public void getProgramari() {
        for (int i=0; i< programari.size(); i++){
            Programare prog = (Programare) programari.get(i);
            System.out.println(String.valueOf(prog.getNr_programare()) + ' ' + prog.getTip_programare() );
        }
    }

    public void getTipuri_programari() {
//        System.out.println(tipuri_programari.size());
        for (int i=0; i< tipuri_programari.size(); i++){
            Tip_Programare tip = new Tip_Programare(tipuri_programari.get(i));
            System.out.println(tip.getDescriere_programare());
            }

    }

    public void getLista_pacienti_tratati() {
        for (int i=0; i< lista_pacienti_tratati.size(); i++){
            Pacienti_Tratati pt = (Pacienti_Tratati) lista_pacienti_tratati.get(i);
            System.out.println(pt.getNume_pacient() + ' ' + pt.getPrenume_pacient());
        }
    }

    public void getLista_pacienti_actuali() {
        for (int i=0; i< lista_pacienti_actuali.size(); i++){
            Pacienti_Actuali pa = (Pacienti_Actuali) lista_pacienti_actuali.get(i);
            System.out.println(pa.getNume_pacient() + ' ' + pa.getPrenume_pacient());
        }
    }

    public void getLista_medicamente() {
        for (int i=0; i< lista_medicamente.size(); i++){
            Prescriptie med = (Prescriptie) lista_medicamente.get(i);
            System.out.println(med.getDenumire_prescriptie() + ' ' + med.getProspect() + ' '+  med.getAfectiune());
        }
    }

    public void adauga_programare(Programare programare) {
        this.programari.add(programare);
        System.out.println("Felicitari! Programarea s-a efectuat");
        System.out.println(programari);
    }

    public void adauga_pacient(Pacient pacient) {
        this.lista_pacienti_actuali.add(pacient);
        System.out.println("Felicitari, v-ati inregistrat cu succes");
        for (int i=0; i< lista_pacienti_actuali.size(); i++){
            Pacient pacient2 = (Pacient) lista_pacienti_actuali.get(i);
            System.out.println(pacient2.getNume_pacient() + ' ' + pacient2.getPrenume_pacient());
        }
    }

    public int nr_vindecati() {
        return lista_pacienti_tratati.size();
    }

    public void sterge_pacient(int index) {
        this.lista_pacienti_actuali.remove(index-1);
        System.out.println("A fost sters pacientul cu numarul " + index);
        for (int i=0; i< lista_pacienti_actuali.size(); i++){
            Pacient pacient2 = (Pacient) lista_pacienti_actuali.get(i);
            System.out.println(pacient2.getNume_pacient() + ' ' + pacient2.getPrenume_pacient());}
    }
}

