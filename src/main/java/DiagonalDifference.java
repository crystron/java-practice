import java.util.List;

public class DiagonalDifference {
    public int diagonalDifference(List<List<Integer>> arr) {
        int main = 0;
        int secondary = 0;
        int size = arr.size();
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++) {
                if (arr.get(i) == arr.get(j))
                    main = main + arr.get(i).get(j);
                if (arr.get(i) == arr.get(size - 1 - j))
                    secondary = secondary + arr.get(i).get(j);
            }
        return Math.abs(main - secondary);
    }
}
