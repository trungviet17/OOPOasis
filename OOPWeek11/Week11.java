import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Week11<T> {

    /**
     * shfjshf.
     * @param arr fhjsf
     * @param <T> hfhs
     * @return hsfjh
     */
    public static <T extends Comparable<T>> List<T> sortGeneric(List<T> arr) {
        List<T> sorted = new ArrayList<>(arr);
        sorted.sort(Comparator.naturalOrder());
        return sorted;
    }
}
