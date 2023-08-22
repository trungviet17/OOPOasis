public class InvalidFundingAmountException extends BankException {

    /**
     * khoi tao.
     *
     * @param message ke thua
     */
    public InvalidFundingAmountException(String message) {
        super(message);
    }

    /**
     * khoi tao.
     *
     * @param amount la tien
     */
    public InvalidFundingAmountException(double amount) {
        super("Số tiền không hợp lệ: $" + String.format("%.2f", amount));
    }
}
