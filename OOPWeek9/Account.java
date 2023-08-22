
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Account {
    public static final String CHECKING = "CHECKING";
    public static final String SAVINGS = "SAVINGS";
    protected long accountNumber;
    protected double balance;
    protected List<Transaction> transactionList = new ArrayList<>();

    /**
     * khoi tao.
     */
    public Account() {
    }

    /**
     * khoi tao.
     *
     * @param accountNumber la so
     * @param balance       la tien
     */
    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    /**
     * khoi tao.
     *
     * @return la so
     */
    public long getAccountNumber() {
        return accountNumber;
    }

    /**
     * khoi tao.
     *
     * @return la tien
     */
    public double getBalance() {
        return balance;
    }

    /**
     * khoi tao.
     *
     * @param accountNumber la so
     */
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * khoi tao.
     *
     * @param balance la tine
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * khoi toa.
     *
     * @param money la tien
     */
    public abstract void withdraw(double money);

    /**
     * khoi tao.
     *
     * @param money hfdfd
     */
    public abstract void deposit(double money);

    /**
     * dfsf.
     *
     * @param money sdfs
     * @throws BankException fsd
     */
    public void doWithdrawing(double money) throws BankException {
        if (money < 0) {
            throw new InvalidFundingAmountException(money);
        } else {
            if (this instanceof SavingsAccount && money > 1000.0) {
                throw new InsufficientFundsException(money);
            } else if (balance < money) {
                throw new InsufficientFundsException(money);
            } else {
                if (this instanceof SavingsAccount && this.getBalance() - money < 5000.0) {
                    throw new InsufficientFundsException(money);
                } else {
                    balance -= money;
                }
            }
        }
    }

    /**
     * dsfsf.
     *
     * @param money ddfs
     * @throws BankException dfs
     */
    public void doDepositing(double money) throws BankException {
        if (money < 0) {
            throw new InvalidFundingAmountException(money);
        } else {
            balance += money;
        }
    }

    /**
     * sfsfsf.
     *
     * @param trans dsfs
     */
    public void addTransaction(Transaction trans) {
        transactionList.add(trans);
    }

    /**
     * sfsfsf.
     *
     * @return sfsd
     */
    public String getTransactionHistory() {
        StringBuilder sb = new StringBuilder();
        sb.append("Lịch sử giao dịch của tài khoản ").append(accountNumber)
                .append(":").append('\n');
        for (Transaction trans : transactionList) {
            sb.append("- ").append(trans.getTransactionSummary()).append('\n');
        }
        return sb.toString();
    }

    /**
     * sfsdfs.
     *
     * @param obj fsdf
     * @return dfsd
     */
    public boolean equals(Object obj) {
        if (obj.getClass() != this.getClass() || obj == null) {
            return false;
        }
        Account acc = (Account) obj;
        return Objects.equals(acc.getAccountNumber(), accountNumber);
    }

}
