public class Transaction {
    public static final int TYPE_DEPOSIT_CHECKING = 1;
    public static final int TYPE_WITHDRAW_CHECKING = -1;
    public static final int TYPE_DEPOSIT_SAVINGS = 2;
    public static final int TYPE_WITHDRAW_SAVINGS = -2;

    private int type;
    private double amount;
    private double initialBalance;
    private double finalBalance;

    /**
     * khai bao.
     *
     * @param type           la kieu
     * @param amount         la tien
     * @param initialBalance la tien sua
     * @param finalBalance   la tien truoc
     */
    public Transaction(int type, double amount, double initialBalance, double finalBalance) {
        this.type = type;
        this.amount = amount;
        this.finalBalance = finalBalance;
        this.initialBalance = initialBalance;
    }

    /**
     * string.
     *
     * @param type la kieu
     * @return string
     */
    private String getTransactionTypeString(int type) {
        if (type == TYPE_DEPOSIT_CHECKING) {
            return "Nạp tiền vãng lai.";
        } else if (type == TYPE_WITHDRAW_CHECKING) {
            return "Rút tiền vãng lai.";
        } else if (type == TYPE_DEPOSIT_SAVINGS) {
            return "Nạp tiền tiết kiệm.";
        } else if (type == TYPE_WITHDRAW_SAVINGS) {
            return "Rút tiền tiết kiệm.";
        } else {
            return "Khong tim thay";
        }
    }

    /**
     * string.
     *
     * @return string
     */
    public String getTransactionSummary() {
        return "Kiểu giao dịch: " + getTransactionTypeString(type)
                + " Số dư ban đầu: $" + String.format("%.2f", initialBalance)
                + ". Số tiền: $" + String.format("%.2f", amount)
                + ". Số dư cuối: $" + String.format("%.2f", finalBalance) + ".";


    }
}
