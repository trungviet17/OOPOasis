
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Bank {
    private List<Customer> customerList = new ArrayList<>();

    /**
     * doc du lieu vao.
     *
     * @param inputStream tregd
     * @throws IOException fgd
     */
    public void readCustomerList(InputStream inputStream) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        Customer currentCustomer = null;
        try {
            while ((line = reader.readLine()) != null) {
                if (Character.isAlphabetic(line.charAt(0))) {
                    String[] tokens = line.split("\\s+(?=\\d)");
                    if (currentCustomer != null) {
                        customerList.add(currentCustomer);
                    }
                    long idNumber = Long.parseLong(tokens[1]);
                    String fullName = tokens[0];
                    currentCustomer = new Customer(idNumber, fullName);
                } else if (Character.isDigit(line.charAt(0)) && currentCustomer != null) {
                    String[] tokens = line.split("\\s+");
                    long accountNumber = Long.parseLong(tokens[0]);
                    String accountType = tokens[1];
                    double balance = Double.parseDouble(tokens[2]);
                    if (accountType.equals(Account.CHECKING)) {
                        currentCustomer.addAccount(new CheckingAccount(accountNumber, balance));
                    } else if (accountType.equals(Account.SAVINGS)) {
                        currentCustomer.addAccount(new SavingsAccount(accountNumber, balance));
                    }
                }
            }

            if (currentCustomer != null) {
                customerList.add(currentCustomer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * sap xep theo id.
     *
     * @return string
     */
    public String getCustomersInfoByIdOrder() {
        StringBuilder res = new StringBuilder();
        List<Customer> sortCus = new ArrayList<>(this.customerList);
        sortCus.sort(new Comparator<Customer>() {
            @Override
            public int compare(Customer c1, Customer c2) {
                if (c1.getIdNumber() > c2.getIdNumber()) {
                    return 1;
                } else if (c1.getIdNumber() < c2.getIdNumber()) {
                    return -1;
                }
                return 0;
            }
        });
        for (Customer cus : sortCus) {
            res.append(cus.getCustomerInfo()).append('\n');
        }
        return res.toString();
    }

    /**
     * tra ve list.
     *
     * @return customer
     */
    public List<Customer> getCustomerList() {
        return customerList;
    }

    /**
     * tra ve list sap xep.
     *
     * @return string
     */
    public String getCustomersInfoByNameOrder() {
        StringBuilder sb = new StringBuilder();
        List<Customer> sortedCus = new ArrayList<>(this.customerList);
        sortedCus.sort(new Comparator<Customer>() {

            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getFullName().compareTo(o2.getFullName());
            }
        });

        for (Customer cus : sortedCus) {
            sb.append(cus.getCustomerInfo()).append('\n');
        }
        return sb.toString();
    }
}
