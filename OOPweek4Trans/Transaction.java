
public class Transaction {
    private String operation;
    private double amount;
    private double balance;
    public static final String DEPOSIT = "deposit";
    public static final String WITHDRAW = "withdraw";

    /**
     * Hàm gán giá trị.
     * @param operation là hành động
     * @param amount là tiền vào ra
     * @param balance là tiền hiện có
     */
    public Transaction(String operation, double amount, double balance) {
        this.operation = operation;
        this.amount = amount;
        this.balance = balance;
    }

    /**
     * Hàm lấy hành vi.
     * @return operation
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Hàm trả về hành vi.
     * @param operation là hành vi
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * Hàm lấy tiền nhận trả.
     * @return amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Hàm gán giá trị vào mua.
     * @param amount là giá trị vào ra
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * Hàm lấy giá trị còn lại.
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Hàm gán giá trị vào ra.
     * @param balance là gía trị còn lại
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

}
