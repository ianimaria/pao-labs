import java.io.IOException;
import java.util.*;
public class ServiciuCabinet {

    public void adauga_doctor(Cabinet cabinet, Scanner scanner) throws IOException {
        System.out.println("Introduceti numele: ");
        String nume = scanner.next();
        System.out.println("Introduceti prenumele: ");
        String prenume = scanner.next();
        System.out.println("Introduceti CNP-ul: ");
        String cnp = scanner.next();
        System.out.println("Introduceti varsta: ");
        int varsta = scanner.nextInt();
        System.out.println("Introduceti nr. de telefon: ");
        String nrTel = scanner.next();
        System.out.println("Introduceti salariul: ");
        int salariu = scanner.nextInt();

        Doctor doc = new Doctor(nume,prenume,cnp,varsta,nrTel,salariu,new Pacient[]{},new Programare[]{});

        Doctor[] doctori = cabinet.getDoctori();
        Doctor[] nou = new Doctor[doctori.length+1];
        System.arraycopy(doctori, 0, nou, 0, doctori.length);
        nou[doctori.length] = doc;

        cabinet.setDoctori(nou);
        System.out.println("Doctorul a fost adaugat cu succes!\n");
        Scriere.scriereAudit("Adauga Doctor");
    }

    public void adauga_pacient(Cabinet cabinet, Scanner scanner) {
        System.out.println("Introduceti numele: ");
        String nume = scanner.next();
        System.out.println("Introduceti prenumele: ");
        String prenume = scanner.next();
        System.out.println("Introduceti CNP-ul: ");
        String cnp = scanner.next();
        System.out.println("Introduceti varsta: ");
        int varsta = scanner.nextInt();
        System.out.println("Introduceti nr. de telefon: ");
        String nrTel = scanner.next();

        Pacient p = new Pacient(nume,prenume,cnp,varsta,nrTel, "null", Boolean.FALSE);
        
        Pacient[] pacienti = cabinet.getPacienti();
        Pacient[] nou = new Pacient[pacienti.length+1];
        System.arraycopy(pacienti, 0, nou, 0, pacienti.length);
        nou[pacienti.length] = p;

        cabinet.setPacienti(nou);
        System.out.println("Pacientul a fost adaugat cu succes!\n");
    }

    public static Pacient[] adauga_pacient2(Pacient[] pacienti, Pacient p) {
        Pacient[] nou = new Pacient[pacienti.length+1];
        System.arraycopy(pacienti, 0, nou, 0, pacienti.length);
        nou[pacienti.length] = p;
        
        return nou;
    }

    public static Doctor[] adauga_doctor2(Doctor[] doctori, Doctor d) {
        Doctor[] nou = new Doctor[doctori.length+1];
        System.arraycopy(doctori, 0, nou, 0, doctori.length);
        nou[doctori.length] = d;

        return nou;
    }
    public static Programare[] adauga_programare2(Programare[] programari, Programare p) {
        Programare[] nou = new Programare[programari.length+1];
        System.arraycopy(programari, 0, nou, 0, programari.length);
        nou[programari.length] = p;

        return nou;
    }

    public static Prescriptie[] adauga_prescriptie2(Prescriptie[] prescriptii, Prescriptie p) {
        Prescriptie[] nou = new Prescriptie[prescriptii.length+1];
        System.arraycopy(prescriptii, 0, nou, 0, prescriptii.length);
        nou[prescriptii.length] = p;

        return nou;
    }

    public void afisare_doctori(Cabinet cabinet)  {

        Doctor[] doctori = cabinet.getDoctori();
        System.out.println("\n");
        System.out.println("---Inainte de sortare---");
        for (Doctor d : doctori)
            System.out.println(d.toString());

        NameComparator nameCompare = new NameComparator();
        Arrays.sort(doctori, nameCompare);
        System.out.println("\n");
        System.out.println("---Dupa sortare---");
        for (Doctor d : doctori)
            System.out.println(d.toString());
    }

    public void afisare_pacienti(Cabinet cabinet) {

        Pacient[] pacienti = cabinet.getPacienti();
        for (Pacient p : pacienti)
            System.out.println(p.toString());


    }

    public int getPacientByCNP(Cabinet cabinet, String cnp) {
        int id = -1;
        Pacient[] lista = cabinet.getPacienti();
        for (int i=0; i<lista.length; i++)
            if (lista[i] != null && lista[i].getCnp().equals(cnp)) {
                id = i;
            }
        return id;
    }

    public int getProgByCod(Cabinet cabinet, String cod) {
        int id = -1;
        Programare[] lista = cabinet.getProgramari();
        for (int i=0; i<lista.length; i++)
            if (lista[i] != null && lista[i].getIdProgramare().equals(cod)) {
                id = i;
            }
        return id;
    }

    public void sterge_pacient(Cabinet cabinet, String cnp) {
        Pacient[] pacienti = cabinet.getPacienti();
        List<Pacient> lista = new ArrayList<>(Arrays.asList(pacienti));
        int index = getPacientByCNP(cabinet,cnp);
//        System.out.print(index);
        if (index == -1) {
            System.out.println("Nu a fost gasit pacientul");
        }
        else
        {   lista.remove(index);
            System.out.println("Pacientul a fost sters cu succes!\n");
            Pacient[] pacienti2 = new Pacient[lista.size()];
            pacienti2 = lista.toArray(pacienti2);
            cabinet.setPacienti(pacienti2);}
    }

    public void afisare_programari(Cabinet cabinet) {

        Programare[] programari = cabinet.getProgramari();
        for (Programare p : programari)
            System.out.println(p.toString());

    }

    public void adaugare_programare(Cabinet cabinet, Scanner scanner, String cnp) {
        int index = getPacientByCNP(cabinet, cnp);
        if (index == -1) {
            System.out.println("Nu a fost gasit pacientul");
        } else {
            System.out.println("Introduceti cod: ");
            String cod = scanner.next();
            if (cod == "-1") {
                System.out.println("Codul programarii nu poate fi -1");
            } else {
                System.out.println("Introduceti data: ");
                String data = scanner.next();
                System.out.println("Introduceti ora: ");
                String ora = scanner.next();

                Programare p = new Programare(cod, data, ora, cabinet.getPacienti()[index]);

                Programare[] programari = cabinet.getProgramari();
                Programare[] nou = new Programare[programari.length + 1];
                System.arraycopy(programari, 0, nou, 0, programari.length);
                nou[programari.length] = p;

                cabinet.setProgramari(nou);
                System.out.println("Programarea a fost inregistrata cu succes si urmeaza sa fie preluata de unul dintre doctori!\n");
            }
        }
    }

    public void sterge_programare(Cabinet cabinet, String cod) {
        Programare[] programari = cabinet.getProgramari();
        List<Programare> lista = new ArrayList<>(Arrays.asList(programari));
        int index = getProgByCod(cabinet,cod);
//        System.out.print(index);
        if (index == -1) {
            System.out.println("Nu a fost gasita programarea");
        }
        else
        {   lista.remove(index);
            System.out.println("Programarea a fost stearsa cu succes!\n");
            Programare[] programari2 = new Programare[lista.size()];
            programari2 = lista.toArray(programari2);
            cabinet.setProgramari(programari2);}
    }

    public void modifica_pacient(Cabinet cabinet, Scanner scanner, String cnp) {
        int index = getPacientByCNP(cabinet, cnp);
        if (index == -1) {
            System.out.println("Nu a fost gasit pacientul");
        } else {
            System.out.println("Introduceti noul numar: ");
            String nr = scanner.next();
            cabinet.getPacienti()[index].setNrTelefon(nr);
            System.out.println("Numarul a fost modificat cu succes!");
        }

    }

    public void modifica_programare(Cabinet cabinet, Scanner scanner, String cod) {
        int index = getProgByCod(cabinet, cod);
        if (index == -1) {
            System.out.println("Nu a fost gasita programarea");
        } else {
            System.out.println("Introduceti noua data: ");
            String data = scanner.next();
            cabinet.getProgramari()[index].setDataProgramare(data);
            System.out.println("Data a fost modificata cu succes!");
        }
    }

}
