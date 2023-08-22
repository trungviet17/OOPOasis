
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Bank bank = new Bank();
        InputStream in = Files.newInputStream(Paths.get("D:\\WorkSpace Trung\\Java\\OOPWeek9\\src\\main\\resources\\checking.txt"));
        bank.readCustomerList(in);
        for (int i = 0; i < bank.getCustomerList().size(); i++) {
            Customer cus = bank.getCustomerList().get(i);
            cus.removeAccount(cus.getAccountList().get(0));
            System.out.println(cus.getFullName());
            for(Account acc : cus.getAccountList()) {
                System.out.println( acc.getAccountNumber() );
            }
        }
    }
}