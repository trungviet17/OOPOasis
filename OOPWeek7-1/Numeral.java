public class Numeral extends Expression {
    private double value;

    public Numeral() {

    }

    public Numeral(double value) {
        this.value = value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return Integer.toString((int) value);
    }

    @Override
    public double evaluate() {
        return value;
    }
}
