import java.sql.SQLOutput;

public class CheckingAccount extends Account {

    /**
     * khoi toa.
     *
     * @param accountNumber la so
     * @param balance       la tien
     */
    public CheckingAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    /**
     * khoi tao.
     *
     * @param money la tien
     */
    @Override
    public void withdraw(double money) {
        try {
            doWithdrawing(money);
            this.addTransaction(new Transaction(-1, money, this.balance + money, this.balance));
        } catch (BankException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * khoi tao.
     *
     * @param money hfdfd
     */
    @Override
    public void deposit(double money) {
        try {
            doDepositing(money);
            this.addTransaction(new Transaction(1, money, this.balance - money, this.balance));
        } catch (BankException e) {
            System.out.println(e.getMessage());
        }
    }


}
