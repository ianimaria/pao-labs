import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {


        Cabinet cabinet = new Cabinet();
        ServiciuCabinet s = new ServiciuCabinet();

        //    Citesc din fisiere

        Pacient[] pacienti = new Pacient[0];
        Citire c = new Citire();
        pacienti = c.citirePacient(pacienti);
        cabinet.setPacienti(pacienti);
        System.out.println(Arrays.toString(pacienti));

        Programare[] programari = new Programare[0];
        programari = c.citireProgramare(cabinet,programari);
        cabinet.setProgramari(programari);
        System.out.println(Arrays.toString(programari));

        Doctor[] doctori = new Doctor[0];
        doctori = c.citireDoctor(cabinet,doctori);
        cabinet.setDoctori(doctori);
        System.out.println(Arrays.toString(doctori));

        Prescriptie[] prescriptii = new Prescriptie[0];
        prescriptii = c.citirePrescriptie(prescriptii);
        cabinet.setPrescriptii(prescriptii);
        System.out.println(Arrays.toString(prescriptii));


        Scriere scrie = new Scriere();
        scrie.scrierePacient(pacienti[1]);
        scrie.scriereDoctor(doctori[2]);
        scrie.scriereProgramare(programari[3]);
        scrie.scrierePrescriptie(prescriptii[0]);


//        Adaug pacienti

//        Pacient p1 = new Pacient("Ion", "Ramona", "21201567425", 33, "0721457894"
//        , "null", Boolean.FALSE);
//        Pacient p2 = new Pacient("Naum", "Dumitru", "10502541256", 48, "0735621548",
//                "diabet", Boolean.TRUE);
//        Pacient p3 = new Pacient("Bara", "Iuliana", "20405242134", 43, "0761254525",
//                "null", Boolean.FALSE);
//
//        Pacient[] p = new Pacient[3];
//        p[0] = p1;
//        p[1] = p2;
//        p[2] = p3;
//
//        cabinet.setPacienti(p);

        //      Adaug programari

//        Programare prog1 = new Programare("prog1", "08/07/2021", "15:00", p1);
//        Programare prog2 = new Programare("prog2", "09/07/2021", "11:00", p1);
//        Programare prog3 = new Programare("prog3", "08/07/2021", "12:00", p3);
//        Programare prog4 = new Programare("prog4", "09/07/2021", "13:00", p2);
//        Programare prog5 = new Programare("prog5", "11/07/2021", "10:00", p3);
//
//        Programare[] pr = new Programare[5];
//        pr[0] = prog1;
//        pr[1] = prog2;
//        pr[2] = prog3;
//        pr[3] = prog4;
//        pr[4] = prog5;
//
//        cabinet.setProgramari(pr);

//        //      Adaug doctori
//
//        Doctor d1 = new Doctor("Mocanu", "Ion", "10205451321", 37, "0732154123",
//                5500, new Pacient[]{p1,p3}, new Programare[]{prog1,prog3});
//        Doctor d2 = new Doctor("Ionescu", "Paris", "12304203024", 41, "0762472872",
//                5000, new Pacient[]{p2}, new Programare[]{prog4});
//        Doctor d3 = new Doctor("Voicu", "Cristina", "20102512354", 48, "0712345125",
//                6500, new Pacient[]{p1}, new Programare[]{prog2});
//        Doctor d4 = new Doctor("Daba", "Lavinia", "20327293920", 46, "0721347074",
//                6200, new Pacient[]{p3}, new Programare[]{prog5});
//
//        Doctor[] nou = new Doctor[4];
//        nou[0] = d1;
//        nou[1] = d2;
//        nou[2] = d3;
//        nou[3] = d4;
//
//        cabinet.setDoctori(nou);

        //       Adaug prescriptii

//        Prescriptie pres1 = new Prescriptie(1, "10502541256", "Ionescu Paris",
//                "insulina, reducerea zaharului", 200 );
//
//        Prescriptie[] prescriptii = new Prescriptie[1];
//        prescriptii[0] = pres1;
//
//        cabinet.setPrescriptii(prescriptii);


        Scanner scanner = new Scanner(System.in);
        System.out.println("\n");


        System.out.println("\n");

        System.out.println("Va rugam sa alegeti o comanda din meniul de mai jos");

        System.out.println("1. Afisati doctorii clinicii noastre");
        System.out.println("2. Adaugare doctor");
        System.out.println("3. Afisare pacienti");
        System.out.println("4. Inscriere ca pacient");
        System.out.println("5. Editare numar de telefon pacient");
        System.out.println("6. Stergere pacient");
        System.out.println("7. Afisare programari");
        System.out.println("8. Faceti o programare");
        System.out.println("9. Modificare data programare");
        System.out.println("10. Anulare programare");
        System.out.println("11. Exit");
        System.out.println("\n");


        while (true) {
            String optiune = scanner.next();
            switch(optiune) {

                case "1":
                    System.out.println("Doctorii clinicii noastre sunt: ");
                    s.afisare_doctori(cabinet);
                    System.out.println("Pentru a alege alta comanda, apasati 12");
                    Scriere.scriereAudit("Afisare Doctori");
                    break;

                case "2":
                    s.adauga_doctor(cabinet,scanner);
                    System.out.println("Pentru a alege alta comanda, apasati 12");
                    Scriere.scriereAudit("Adaugare Doctor");
                    break;

                case "3":
                    System.out.println("Pacientii clinicii noastre sunt: ");
                    s.afisare_pacienti(cabinet);
                    System.out.println("Pentru a alege alta comanda, apasati 12");
                    Scriere.scriereAudit("Afisare pacienti");
                    break;

                case "4":
                    s.adauga_pacient(cabinet,scanner);
                    System.out.println("Pentru a alege alta comanda, apasati 12");
                    Scriere.scriereAudit("Adaugare pacient");
                    break;

                case "5":
                    System.out.println("Introduceti CNP-ul pacientului caruia doriti sa ii modificati numarul");
                    String cnp = scanner.next();
                    s.modifica_pacient(cabinet, scanner, cnp);
                    System.out.println("Pentru a alege alta comanda, apasati 12");
                    Scriere.scriereAudit("Modificare pacient");
                    break;

                case "6":
                    System.out.println("Introduceti CNP-ul pacientului pe care doriti sa il stergeti");
                    String cnp2 = scanner.next();
                    s.sterge_pacient(cabinet,
                            cnp2);
                    System.out.println("Pentru a alege alta comanda, apasati 12");
                    Scriere.scriereAudit("Stergere pacient");
                    break;

                case "7":
                    System.out.println("Programarile existente sunt: ");
                    s.afisare_programari(cabinet);
                    System.out.println("Pentru a alege alta comanda, apasati 12");
                    Scriere.scriereAudit("Afisare programari");
                    break;

               case "8":
                    System.out.println("Pentru a face o programare trebuie sa fiti deja inregistrat ca pacient");
                    System.out.println("Introduceti CNP-ul: ");
                    String cnp3 = scanner.next();
                    s.adaugare_programare(cabinet,scanner, cnp3);
                    System.out.println("Pentru a alege alta comanda, apasati 12");
                   Scriere.scriereAudit("Adaugare programare");
                    break;

               case "9":
                    System.out.println("Introduceti codul programarii pe care doriti sa o modificati");
                    String cod = scanner.next();
                    s.modifica_programare(cabinet, scanner, cod);
                    System.out.println("Pentru a alege alta comanda, apasati 12");
                    break;

               case "10":
                    System.out.println("Introduceti codul programarii pe care doriti sa o stergeti");
                    String cod2 = scanner.next();
                    s.sterge_programare(cabinet,cod2);

                    System.out.println("Pentru a alege alta comanda, apasati 12");
                    Scriere.scriereAudit("Stergere programare");
                    break;

               case "11":
                    System.out.println("La revedere!");
                    Scriere.scriereAudit("Iesire program");
                    System.exit(0);

                    break;

               case "12":

                   System.out.println("Va rugam sa alegeti o comanda din meniul de mai jos");

                   System.out.println("1. Afisati doctorii clinicii noastre");
                   System.out.println("2. Adaugare doctor");
                   System.out.println("3. Afisare pacienti");
                   System.out.println("4. Inscriere ca pacient");
                   System.out.println("5. Editare numar de telefon pacient");
                   System.out.println("6. Stergere pacient");
                   System.out.println("7. Afisare programari");
                   System.out.println("8. Faceti o programare");
                   System.out.println("9. Modificare data programare");
                   System.out.println("10. Anulare programare");
                   System.out.println("11. Exit");
                   System.out.println("\n");
                   Scriere.scriereAudit("Alege alta comanda");

            default:
            {
                System.out.println("Ati introdus o comanda gresita");
                Scriere.scriereAudit("Comanda incorecta");}

            }
        }
    }
}
