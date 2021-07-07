import java.util.Comparator;

public class NameComparator implements Comparator<Doctor> {

    @Override
    public int compare(Doctor o1, Doctor o2) {
        return o1.getNume().compareTo(o2.getNume());
    }
}
