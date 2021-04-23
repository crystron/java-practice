import java.util.List;
import java.util.stream.Collectors;

public class BirthdayCakeCandles {
    public int birthdayCakeCandles(List<Integer> candles) {
        int max = candles.stream().max(Integer::compare).get();
        return (int) candles.stream().filter((s) -> s == max).count();
    }
}
