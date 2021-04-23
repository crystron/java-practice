
public class LeftRotation {
    public int[] getArray(int t) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int[] b = a;
        for (int j = 0; j < t; j++) {
            int[] temp = new int[a.length];
            for (int i = 0; i < b.length - 1; i++) {
                temp[i] = b[i + 1];
            }
            if (j >= a.length) {
                temp[temp.length - 1] = a[j - (a.length)];
                b = temp;
            } else {
                temp[temp.length - 1] = a[j];
                b = temp;
            }
        }
        a = b;
        return a;
    }
}
