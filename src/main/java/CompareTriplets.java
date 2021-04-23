import java.util.ArrayList;
import java.util.List;

public class CompareTriplets {
    public List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<Integer>();
        result.add(0, 0);
        result.add(1, 0);
        int countA = 0;
        int countB = 0;
        if (a.size() == b.size()) {
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i) > b.get(i)) {
                    countA++;
                    result.set(0, countA);
                } else if (a.get(i) < b.get(i)) {
                    countB++;
                    result.set(1, countB);
                }
            }
        }
        return result;
    }
}
