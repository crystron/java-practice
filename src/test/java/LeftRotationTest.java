import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class LeftRotationTest {
    @Test
    public void getArray() {
        LeftRotation leftRotation = new LeftRotation();
        int a[] = {3, 4, 5, 6, 7, 1, 2};
        int b[] = leftRotation.getArray(2);

        assertEquals(a.getClass(), b.getClass());
    }
}