public class InsufficientFundsException extends BankException {

    /**
     * khoi tao.
     *
     * @param amount la double
     */
    public InsufficientFundsException(double amount) {
        super("Số dư tài khoản không đủ $" + String.format("%.2f", amount)
                + " để thực hiện giao dịch");
    }
}
