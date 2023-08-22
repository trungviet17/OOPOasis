import java.util.ArrayList;
import java.util.List;

public class Customer {
    private long idNumber;
    private String fullName;
    private List<Account> accountList = new ArrayList<>();

    /**
     * khoi ta0.
     */
    public Customer() {
    }

    /**
     * khoi tao.
     *
     * @param idNumber la id
     * @param fullName la ten
     */
    public Customer(long idNumber, String fullName) {
        this.idNumber = idNumber;
        this.fullName = fullName;
    }

    /**
     * khoi tao.
     *
     * @return la string
     */
    public String getCustomerInfo() {
        return "Số CMND: " + idNumber + ". Họ tên: " + fullName + ".";
    }

    /**
     * khoi tao.
     *
     * @param account la tk
     */
    public void addAccount(Account account) {
        accountList.add(account);
    }

    /**
     * khoi tao.
     *
     * @param account la tk
     */
    public void removeAccount(Account account) {
        accountList.remove(account);
    }

    /**
     * khoi tao.
     *
     * @return la id
     */
    public long getIdNumber() {
        return idNumber;
    }

    /**
     * khoi tao.
     *
     * @return la list
     */
    public List<Account> getAccountList() {
        return accountList;
    }

    /**
     * khoi tao.
     *
     * @return la ten
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * khoi tao.
     *
     * @param fullName la ten
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * khoi toa.
     *
     * @param idNumber la id
     */
    public void setIdNumber(long idNumber) {
        this.idNumber = idNumber;
    }

}
