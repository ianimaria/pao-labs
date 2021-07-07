import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Scriere {

    public void scrierePacient (Pacient p) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Pacient_out.csv"));

        bufferedWriter.append(p.getNume());
        bufferedWriter.append(",");
        bufferedWriter.append(p.getPrenume());
        bufferedWriter.append(",");
        bufferedWriter.append(p.getCnp());
        bufferedWriter.append(",");
        bufferedWriter.append(String.valueOf(p.getVarsta()));
        bufferedWriter.append(",");
        bufferedWriter.append(p.getNrTelefon());
        bufferedWriter.append(",");
        bufferedWriter.append(p.getDiagnostic());
        bufferedWriter.append("\n");

        bufferedWriter.close();

    }

    public void scriereDoctor (Doctor p) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Doctor_out.csv"));

        bufferedWriter.append(p.getNume());
        bufferedWriter.append(",");
        bufferedWriter.append(p.getPrenume());
        bufferedWriter.append(",");
        bufferedWriter.append(p.getCnp());
        bufferedWriter.append(",");
        bufferedWriter.append(String.valueOf(p.getVarsta()));
        bufferedWriter.append(",");
        bufferedWriter.append(p.getNrTelefon());
        bufferedWriter.append(",");
        bufferedWriter.append(String.valueOf(p.getSalariu()));
        bufferedWriter.append(",");
        bufferedWriter.append(Arrays.toString(p.getPacienti()));
        bufferedWriter.append(",");
        bufferedWriter.append(Arrays.toString(p.getProgramari()));
        bufferedWriter.append("\n");

        bufferedWriter.close();

    }

    public void scriereProgramare (Programare p) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Programare_out.csv"));

        bufferedWriter.append(p.getIdProgramare());
        bufferedWriter.append(",");
        bufferedWriter.append(p.getDataProgramare());
        bufferedWriter.append(",");
        bufferedWriter.append(p.getOraProgramare());
        bufferedWriter.append(",");
        bufferedWriter.append(p.getPacient().getNume());
        bufferedWriter.append("\n");

        bufferedWriter.close();

    }

    public void scrierePrescriptie (Prescriptie p) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Prescriptie_out.csv"));

        bufferedWriter.append(String.valueOf(p.getNrPrescriptie()));
        bufferedWriter.append(",");
        bufferedWriter.append(p.getCnpPacient());
        bufferedWriter.append(",");
        bufferedWriter.append(p.getNumeDoctor());
        bufferedWriter.append(",");
        bufferedWriter.append(p.getReteta());
        bufferedWriter.append(",");
        bufferedWriter.append(String.valueOf(p.getPret()));
        bufferedWriter.append("\n");

        bufferedWriter.close();

    }

    public static void scriereAudit(String operatie) throws IOException {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Audit.csv",true));

        LocalDateTime timp = LocalDateTime.now();

        String stimp = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss").format(timp);

        bufferedWriter.append(operatie);
        bufferedWriter.append(",");
        bufferedWriter.append(stimp);
        bufferedWriter.append("\n");

        bufferedWriter.close();


    }
}
