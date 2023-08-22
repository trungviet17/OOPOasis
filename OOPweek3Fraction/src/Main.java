import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Solution p1 = new Solution(a, b);
        int c = sc.nextInt();
        int d = sc.nextInt();
        Solution p2 = new Solution(c,d);
        p1.add(p2).print();
    }
}