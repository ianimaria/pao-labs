import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Cabinet_Medical cabinet = new Serviciu_Cabinet().construiesteCabinet();

        System.out.println("\n");

        System.out.println("Bine ati venit la "+ cabinet.getNume_cabinet());

        System.out.println("\n");

        System.out.println("Va rugam sa alegeti o comanda din meniul de mai jos");

        System.out.println("1. Afisati tipurile de programari de care puteti beneficia");
        System.out.println("2. Inscriere ca pacient");
        System.out.println("3. Stergere pacient");
        System.out.println("4. Afisati doctorii clinicii noastre");
        System.out.println("5. Afisati pacientii vindecati");
        System.out.println("6. Afisati pacientii curenti");
        System.out.println("7. Numarul de pacienti vindecati de noi");
        System.out.println("8. Afisati lista programarilor efectuate");
        System.out.println("9. Lista de medicamente ce pot fi oferite de clinica noastra");
        System.out.println("10. Exit");
        System.out.println("\n");


        while (true) {
            String optiune = scanner.next();
            switch(optiune) {

                case "1":
                    System.out.println("Tipurile de programari oferite de clinica noastra sunt: ");
                    cabinet.getTipuri_programari();
                    System.out.println("Pentru a alege alta comanda, apasati 11");
                    break;

                case "2":
                    System.out.println("Va rugam sa va introduceti numele: ");
                    String numepacient = scanner.next();
                    System.out.println("Acum prenumele: ");
                    String prenumepacient = scanner.next();
                    Pacient pacient = new Pacient(numepacient,prenumepacient);
                    cabinet.adauga_pacient(pacient);
                    cabinet.getLista_pacienti_actuali();
                    System.out.println("Pentru a alege alta comanda, apasati 11");
                    break;

                case "3":
                    System.out.println("Introduceti nr pacientului pe care doriti sa il stergeti");
                    String index = scanner.next();
                    cabinet.sterge_pacient(Integer.valueOf(index)-1);
                    System.out.println("Pentru a alege alta comanda, apasati 11");
                    break;

                case "4":
                    System.out.println("Doctorii clinicii noastre sunt: ");
                    cabinet.getDoctori();
                    System.out.println("Pentru a alege alta comanda, apasati 11");
                    break;

                case "5":
                    System.out.println("Pacientii vindecati de noi sunt: ");
                    cabinet.getLista_pacienti_tratati();
                    System.out.println("Pentru a alege alta comanda, apasati 11");
                    break;

                case "6":
                    System.out.println("Pacientii actuali din clinica noastra sunt: ");
                    cabinet.getLista_pacienti_actuali();
                    System.out.println("Pentru a alege alta comanda, apasati 11");
                    break;

                case "7":
                    System.out.println("In total, nr de pacienti vindecati este ");
                    System.out.println(cabinet.nr_vindecati());
                    System.out.println("Pentru a alege alta comanda, apasati 11");
                    break;

                case "8":
                    System.out.println("Programarile efectuate deja in clinica sunt: ");
                    cabinet.getProgramari();
                    System.out.println("Pentru a alege alta comanda, apasati 11");
                    break;

                case "9":
                    System.out.println("Clinica noastra ofera urmatoarele medicamente: ");
                    cabinet.getLista_medicamente();
                    System.out.println("Pentru a alege alta comanda, apasati 11");
                    break;

                case "10":
                    System.out.println("La revedere!");
                    System.exit(0);
                    break;

                case "11":
                    System.out.println("Va rugam sa alegeti o comanda din meniul de mai jos");

                    System.out.println("1. Afisati tipurile de programari de care puteti beneficia");
                    System.out.println("2. Inscriere ca pacient");
                    System.out.println("3. Stergere pacient");
                    System.out.println("4. Afisati doctorii clinicii noastre");
                    System.out.println("5. Afisati pacientii vindecati");
                    System.out.println("6. Afisati pacientii curenti");
                    System.out.println("7. Numarul de pacienti vindecati de noi");
                    System.out.println("8. Afisati lista programarilor efectuate");
                    System.out.println("9. Lista de medicamente ce pot fi oferite de clinica noastra");
                    System.out.println("10. Exit");
                    System.out.println("\n");

                default:
                    System.out.println("Ati introdus o comanda gresita");

            }
        }


    }
}
