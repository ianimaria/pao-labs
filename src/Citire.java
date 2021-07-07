import javax.print.Doc;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Citire {

    public Pacient[] citirePacient (Pacient[] pacienti1) throws IOException, ClassNotFoundException {
        String path = "C:\\Users\\Maria\\Desktop\\Proiect PAO\\pao-labs\\src\\Pacient.csv";
        ArrayList<Pacient> pacienti = new ArrayList<Pacient>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String data;
        data = bufferedReader.readLine();
        while (data != null) {
            String[] listaDate = data.split(",");
            Pacient newPac = new Pacient();
            newPac.setNume(listaDate[0]);
            newPac.setPrenume(listaDate[1]);
            newPac.setCnp(listaDate[2]);
            newPac.setVarsta(Integer.parseInt(listaDate[3]));
            newPac.setNrTelefon(listaDate[4]);
            newPac.setDiagnostic(listaDate[5]);
            newPac.setTratat(Boolean.valueOf(listaDate[6]));

            pacienti.add(newPac);
            data = bufferedReader.readLine();
        }

        for (Pacient p : pacienti) {
            pacienti1 = ServiciuCabinet.adauga_pacient2(pacienti1,p);
        }
    return pacienti1;
    }

    public Programare[] citireProgramare(Cabinet cabinet, Programare[] programari1) throws IOException, ClassNotFoundException {
        String path = "C:\\Users\\Maria\\Desktop\\Proiect PAO\\pao-labs\\src\\Programare.csv";
        ArrayList<Programare> programari = new ArrayList<>();
        BufferedReader bufferedReader= new BufferedReader(new FileReader(path));

        String data;
        data = bufferedReader.readLine();
        while (data != null) {
            String[] listaDate = data.split(",");
            Programare newProg = new Programare();
            newProg.setIdProgramare(listaDate[0]);
            newProg.setDataProgramare(listaDate[1]);
            newProg.setOraProgramare(listaDate[2]);
            Pacient pacient = cabinet.getPacienti()[(Integer.parseInt(listaDate[3])-1)];
            newProg.setPacient(pacient);

            programari.add(newProg);
            data = bufferedReader.readLine();
        }
        for (Programare p : programari) {
            programari1 = ServiciuCabinet.adauga_programare2(programari1,p);
        }
        return programari1;
    }
    public Doctor[] citireDoctor (Cabinet cabinet,Doctor[] doctori1) throws IOException, ClassNotFoundException {
        String path = "C:\\Users\\Maria\\Desktop\\Proiect PAO\\pao-labs\\src\\Doctor.csv";
        ArrayList<Doctor> doctori = new ArrayList<>();
        BufferedReader bufferedReader= new BufferedReader(new FileReader(path));

        String data;
        data = bufferedReader.readLine();
        while (data != null) {
            String[] listaDate = data.split(","); // Salvez datele separate prin virgula
            Doctor newDoc = new Doctor();

            newDoc.setNume(listaDate[0]);
            newDoc.setPrenume(listaDate[1]);
            newDoc.setCnp(listaDate[2]);
            newDoc.setVarsta(Integer.parseInt(listaDate[3]));
            newDoc.setNrTelefon(listaDate[4]);
            newDoc.setSalariu(Integer.parseInt(listaDate[5]));

            String[] p = listaDate[6].split(" ");
            Pacient[] pacienti = new Pacient[p.length];
            for (int i = 0; i<p.length; i++) {
//                System.out.println(p[i]);
                pacienti[i] = cabinet.getPacienti()[Integer.parseInt(p[i])-1];
            }
            newDoc.setPacienti(pacienti);
            String[] prog = listaDate[7].split(" ");
            Programare[] programari = new Programare[prog.length];
            for (int i=0; i<prog.length; i++) {
                programari[i] = cabinet.getProgramari()[Integer.parseInt(p[i])-1];
            }
            newDoc.setProgramari(programari);
            doctori.add(newDoc);
            data = bufferedReader.readLine();
        }
        for (Doctor d : doctori){
            doctori1 = ServiciuCabinet.adauga_doctor2(doctori1,d);
        }
        return doctori1;

    }

    public Prescriptie[] citirePrescriptie (Prescriptie[] prescriptii1) throws IOException, ClassNotFoundException {
        String path = "C:\\Users\\Maria\\Desktop\\Proiect PAO\\pao-labs\\src\\Prescriptie.csv";
        ArrayList<Prescriptie> prescriptii = new ArrayList<Prescriptie>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String data;
        data = bufferedReader.readLine();
        while (data != null) {
            String[] listaDate = data.split(",");
            Prescriptie newPr = new Prescriptie();
            newPr.setNrPrescriptie(Integer.parseInt(listaDate[0]));
            newPr.setCnpPacient(listaDate[1]);
            newPr.setNumeDoctor(listaDate[2]);
            newPr.setReteta(listaDate[3]);
            newPr.setPret(Double.parseDouble(listaDate[4]));

            prescriptii.add(newPr);
            data = bufferedReader.readLine();
        }

        for (Prescriptie p : prescriptii) {
            prescriptii1 = ServiciuCabinet.adauga_prescriptie2(prescriptii1,p);
        }
        return prescriptii1;
    }

}
