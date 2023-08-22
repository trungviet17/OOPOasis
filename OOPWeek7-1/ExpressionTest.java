public class ExpressionTest {
    /**
     * ham test.
     * @param args string
     */
    public static void main(String[] args) {
        try {
            Expression e = new Square(new Addition(new Subtraction(new Square(new Numeral(10)),
                    new Numeral(3)), new Multiplication(new Numeral(4), new Numeral(3))));
            System.out.println(e.toString());
            System.out.println(e.evaluate());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

    }
}
