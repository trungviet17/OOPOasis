import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Week8Task2 {

    /**
     * bat loi.
     */
    public static void nullPointerEx() {
        String r = null;
        System.out.println(r.length());
    }

    /**
     * tra loi.
     * @return loi
     */
    public static String nullPointerExTest() {
        try {
            nullPointerEx();
        } catch (NullPointerException e) {
            return "Lỗi Null Pointer";
        }
        return "Không có lỗi";

    }

    /**
     * bat loi.
     */
    public static void arrayIndexOutOfBoundsEx() {
        int[] a = new int[3];
        System.out.println(a[3]);
    }

    /**
     * tra loi.
     * @return loi
     */
    public static String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Lỗi Array Index Out of Bounds";
        }
        return "Không có lỗi";
    }

    /**
     * bat loi.
     */
    public static void arithmeticEx() {
        int a = 1;
        int b = 0;
        System.out.println(a / b);
    }

    /**
     * tra loi.
     * @return loi
     */
    public static String arithmeticExTest() {
        try {
            arithmeticEx();
        } catch (ArithmeticException e) {
            return "Lỗi Arithmetic";
        }
        return "Không có lỗi";
    }

    /**
     * bat loi.
     */
    public static void fileNotFoundEx() throws FileNotFoundException {
        File input = new File("input.txt");
        Scanner sc = new Scanner(input);
        while (sc.hasNext()) {
            String line = sc.nextLine();
            System.out.println(line);
        }
    }

    /**
     * tra loi.
     * @return loi
     */
    public static String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
        } catch (FileNotFoundException e) {
            return "Lỗi File Not Found";
        }
        return "Không có lỗi";
    }

    /**
     * bat loi.
     */
    public static void ioEx() throws IOException {
        throw new IOException("Lỗi IO");
    }

    /**
     * tra loi.
     * @return loi
     */
    public static String ioExTest() {
        try {
            ioEx();
        } catch (IOException e) {
            return e.getMessage();
        }
        return "Không có lỗi";
    }
}
