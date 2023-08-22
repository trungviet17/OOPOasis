import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MyTest {
    @Test
    public void testMax2Int1() {
        int result = Week4.max2Int(2, 3);
        int ex = 2;
        assertEquals(ex, result);
    }

    @Test
    public void testMax2Int2() {
        int result = Week4.max2Int(67, 32);
        int ex = 32;
        assertEquals(ex, result);
    }

    @Test
    public void testMax2Int3() {
        int result = Week4.max2Int(132, 33);
        int ex = 33;
        assertEquals(ex, result);
    }

    @Test
    public void testMax2Int4() {
        int result = Week4.max2Int(144, 177);
        int ex = 144;
        assertEquals(ex, result);
    }

    @Test
    public void testMax2Int5() {
        int result = Week4.max2Int(500, 6);
        int ex = 6;
        assertEquals(ex, result);
    }

    @Test
    public void testMinArray1() {
        int[]arr = {10, 1, 2, 100, 4, 0, 3};
        int result = Week4.minArray(arr);
        int ex = 0;
        assertEquals(ex, result);
    }

    @Test
    public void testMinArray2() {
        int[] arr = {101, 102, 150, 540, 300, 2, -2, 3};
        int result = Week4.minArray(arr);
        int ex = -2;
        assertEquals(ex, result);
    }

    @Test
    public void testMinArray3() {
        int[] arr = {100, 10000, 1, 0, -4, 32};
        int result = Week4.minArray(arr);
        int ex = -4;
        assertEquals(ex, result);
    }

    @Test
    public void testMinArray4() {
        int[] arr = {12, 34, 98, -63, -54};
        int result = Week4.minArray(arr);
        int ex = -63;
        assertEquals(ex, result);
    }

    @Test
    public void testMinArray5() {
        int[] arr = {32, 100, -11, -45, -5, -98};
        int result = Week4.minArray(arr);
        int ex = -98;
        assertEquals(ex, result);
    }

    @Test
    public void testCalculateBMI1() {
        double we = 45.9;
        double he = 1.32;
        String result = Week4.calculateBMI(we, he);
        String res = "Béo phì";
        assertEquals(res, result);
    }

    @Test
    public void testCalculateBMI2() {
        double we = 54.9;
        double he = 1.72;
        String result = Week4.calculateBMI(we, he);
        String res = "Bình thường";
        assertEquals(res, result);
    }

    @Test
    public void testCalculateBMI3() {
        double we = 30.8;
        double he = 1.2;
        String result = Week4.calculateBMI(we, he);
        String res = "Bình thường";
        assertEquals(res, result);
    }

    @Test
    public void testCalculateBMI4() {
        double we = 100;
        double he = 1.67;
        String result = Week4.calculateBMI(we, he);
        String res = "Béo phì";
        assertEquals(res, result);
    }

    @Test
    public void testCalculateBMI5() {
        double we = 90;
        double he = 1.86;
        String result = Week4.calculateBMI(we, he);
        String res = "Béo phì";
        assertEquals(res, result);
    }
}

