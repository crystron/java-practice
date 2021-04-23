public class Recursion {
    public static int count = 0;

    public int Recursion(int n) {
        if (n < 1) return 0;
        return n + Recursion(n - 1);
    }
}
