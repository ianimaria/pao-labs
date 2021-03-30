import java.util.ArrayList;
import java.util.List;


public class Serviciu_Cabinet extends Cabinet_Medical {

    public Cabinet_Medical construiesteCabinet() {


//         Tipuri de programari

        String descriere_programare1 = "Radiografie";

        String descriere_programare2 = "Masaj";

        String descriere_programare3 = "Control de rutina";

        String descriere_programare4 = "Operatie";

        String descriere_programare5 = "Recuperare medicala";

        double pret_programare1 = 38.00;

        double pret_programare2 = 60.00;

        double pret_programare3 = 50.00;

        double pret_programare4 = 250.00;

        double pret_programare5 = 100.00;



        Tip_Programare tipprogramare1 = new Tip_Programare(descriere_programare1,pret_programare1);

        Tip_Programare tipprogramare2 = new Tip_Programare(descriere_programare2,pret_programare2);

        Tip_Programare tipprogramare3 = new Tip_Programare(descriere_programare3,pret_programare3);

        Tip_Programare tipprogramare4 = new Tip_Programare(descriere_programare4,pret_programare4);

        Tip_Programare tipprogramare5 = new Tip_Programare(descriere_programare5,pret_programare5);


        List<Tip_Programare> lista_tipprogramari = new ArrayList<>();

        lista_tipprogramari.add(tipprogramare1);

        lista_tipprogramari.add(tipprogramare2);

        lista_tipprogramari.add(tipprogramare3);

        lista_tipprogramari.add(tipprogramare4);

        lista_tipprogramari.add(tipprogramare5);


//        Programari

        Programare programare1 = new Programare(1,pret_programare1, tipprogramare1) ;

        Programare programare2 = new Programare(2,pret_programare2, tipprogramare2) ;

        Programare programare3 = new Programare(3,pret_programare3, tipprogramare3) ;

        Programare programare4 = new Programare(4,pret_programare4, tipprogramare4) ;

        Programare programare5 = new Programare(5,pret_programare5, tipprogramare5) ;

        List<Object> lista_programari = new ArrayList<>();

        lista_programari.add(programare1);

        lista_programari.add(programare2);

        lista_programari.add(programare3);

        lista_programari.add(programare4);

        lista_programari.add(programare5);



//        Doctor

        Doctor doctor1 = new Doctor("Popa","Ciprian");

        Doctor doctor2 = new Doctor("Popescu","Gheorghe");

        Doctor doctor3 = new Doctor("Mantu","Georgiana");

        Doctor doctor4 = new Doctor("Mihai","Antonia");

        Doctor doctor5 = new Doctor("Andrei","Vlad");

        doctor1.adauga_programare(programare1);

        doctor2.adauga_programare(programare2);

        doctor2.adauga_programare(programare3);

        doctor3.adauga_programare(programare4);

        doctor4.adauga_programare(programare5);

        List<Object> doctori = new ArrayList<>();

        doctori.add(doctor1);

        doctori.add(doctor2);

        doctori.add(doctor3);

        doctori.add(doctor4);

        doctori.add(doctor5);


//        Pacienti tratati

        Pacienti_Tratati pacient1 = new Pacienti_Tratati("Ibraim", "Melek", "Anxietate", "Popa");

        Pacienti_Tratati pacient2 = new Pacienti_Tratati("Craciun", "Alina", "Depresie", "Caraiani");

        Pacienti_Tratati pacient3 = new Pacienti_Tratati("Musat", "Radu", "Pietre la rinichi", "Popescu");

        Pacienti_Tratati pacient4 = new Pacienti_Tratati("Inat", "Filis", "Scolioza", "Mihai");

        Pacienti_Tratati cat = new Pacienti_Tratati("Osman", "Ozal", "Epilepsie", "Andrei");

        List<Pacienti_Tratati> pacienti_tratati = new ArrayList<>();

        pacienti_tratati.add(pacient1);

        pacienti_tratati.add(pacient2);

        pacienti_tratati.add(pacient3);

        pacienti_tratati.add(pacient4);

        pacienti_tratati.add(cat);


//        Pacienti actuali

        Pacienti_Actuali pacient_1 = new Pacienti_Actuali("Smiran", "Dickson", "Malarie", "Mantu");

        Pacienti_Actuali pacient_2 = new Pacienti_Actuali("Byrd", "Connie", "Infectie tetanos","Andrei");

        Pacienti_Actuali pacient_3 = new Pacienti_Actuali("Dudley", "Leonie", "Hepatita D", " Popescu");

        Pacienti_Actuali pacient_4 = new Pacienti_Actuali("Portillo", "Carina", "COVID-19", "Popa");

        Pacienti_Actuali pacient_5   = new Pacienti_Actuali("Jerry", "Lewis", "COVID-19", "Popa");

        List<Object> pacienti_actuali = new ArrayList<>();

        pacienti_actuali.add(pacient_1);

        pacienti_actuali.add(pacient_2);

        pacienti_actuali.add(pacient_3);

        pacienti_actuali.add(pacient_4);

        pacienti_actuali.add(dog);

//        Medicamentele pe care le putem oferi

        Prescriptie med1 = new Prescriptie("Aspirina", "De trei ori pe zi dupa masa", "Arthritis");

        Prescriptie med2 = new Prescriptie("Diclotard", "De doua-trei ori pe zi inainte de masa", "Fibromyalgia");

        Prescriptie med3 = new Prescriptie("Rompirin", "O data la 12h","Cancer");

        Prescriptie med4 = new Prescriptie("Atenolol", "O data sau de doua ori pe zi", "Hypertension");

        Prescriptie med5 = new Prescriptie("Adderall XR", "Dimineata, inainte de masa", "ADHD");

        List<Object> lista_medicamente = new ArrayList<>();

        lista_medicamente.add(med1);

        lista_medicamente.add(med2);

        lista_medicamente.add(med3);

        lista_medicamente.add(med4);

        lista_medicamente.add(med5);

        return new Cabinet_Medical(

                "Cabinet Medical 1",

                "Constanta, CT",

                doctori,

                lista_tipprogramari,

                lista_programari,

                pacienti_tratati,

                pacienti_actuali,

                lista_medicamente)
        ;
    }
}
