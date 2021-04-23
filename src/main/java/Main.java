import java.io.BufferedReader;
import java.security.SecureRandom;
import java.sql.Array;
import java.sql.Timestamp;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.*;

public class Main {
    /*public static Predicate<Integer> isEqual(int n) {
        return p -> p == n;
    }*/
    private final MyComponent myComponent;

    public Main(MyComponent myComponent) {
        this.myComponent = myComponent;
    }

    public static void main(String[] args) {
        int[] array = {256741038, 623958417, 467905213, 714532089, 938071625};
        MiniMaxSum miniMaxSum = new MiniMaxSum();
        miniMaxSum.miniMaxSum(array);
    }
}
