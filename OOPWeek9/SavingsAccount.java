public class SavingsAccount extends Account {

    /**
     * khoi tao.
     *
     * @param accountNumber la id
     * @param balance       la tien
     */
    public SavingsAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    /**
     * lay tien.
     *
     * @param money la tien
     */
    @Override
    public void withdraw(double money) {
        try {
            doWithdrawing(money);
            this.addTransaction(new Transaction(-2, money, this.balance + money, this.balance));
        } catch (BankException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * lay tien.
     *
     * @param money hfdfd
     */
    @Override
    public void deposit(double money) {
        try {
            doDepositing(money);
            this.addTransaction(
                    new Transaction(2, money, this.balance - money, this.balance));
        } catch (BankException e) {
            System.out.println(e.getMessage());
        }
    }


}
