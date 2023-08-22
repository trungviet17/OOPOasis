import java.util.ArrayList;

public class Account {
    private double balance;
    private ArrayList<Transaction> transitionList;

    /**
     * Hàm khởi tạo giá trị.
     */
    public Account() {
        balance = 0;
        transitionList = new ArrayList<Transaction>();
    }

    /**
     * Hàm kiểm tra số tiền thêm vào.
     * @param amount là số tiền cho vào.
     */
    private void deposit(double amount) {
        if (amount < 0) {
            System.out.println("So tien ban nap vao khong hop le!");
        } else {
            balance += amount;
        }
    }

    /**
     * Hàm kiểm tra số tiền rút ra.
     * @param amount là số tiền rút ra.
     */
    private void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("So tien ban rut ra khong hop le!");
        } else if (amount > balance) {
            System.out.println("So tien ban rut vuot qua so du!");
        } else {
            balance -= amount;
        }
    }

    /**
     * Hàm thêm danh sách giao dịch.
     * @param amount lượng tiền vào ra.
     * @param operation là hành động rút/nạp tiền.
     */
    public void addTransaction(double amount, String operation) {
        if (!operation.equals(Transaction.DEPOSIT) && !operation.equals(Transaction.WITHDRAW))  {
            System.out.println("Yeu cau khong hop le!");
        } else if (operation.equals(Transaction.DEPOSIT)) {
            deposit(amount);
        } else {
            withdraw(amount);
        }
        Transaction trans = new Transaction(operation, amount, balance);
        transitionList.add(trans);
    }

    /**
     * Hàm in danh sách giao dịch.
     */
    public void printTransaction() {
        for (int i = 0; i < transitionList.size(); i++) {
            String oper = transitionList.get(i).getOperation();
            double amo = transitionList.get(i).getAmount();
            double bala = transitionList.get(i).getBalance();
            System.out.printf("Giao dich %d: ", i + 1);
            if (oper.equals(Transaction.DEPOSIT)) {
                System.out.printf("Nap tien $%.2f. ", amo);
            } else {
                System.out.printf("Rut tien $%.2f. ", amo);
            }
            System.out.printf("So du luc nay: $%.2f.\n", bala);
        }
    }





}
