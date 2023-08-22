public class Staff extends Person {
    private String school;
    private double pay;

    /**
     * Đặt staff.
     * @param name là têm
     * @param address là địa chỉ
     * @param school là trường
     * @param pay là tiền trả
     */
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    /**
     * Đặt trường.
     * @return trường
     */
    public String getSchool() {
        return school;
    }

    /**
     * Lấy trường.
     * @param school là trường học
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * Lấy số tiền trả.
     * @return pay
     */
    public double getPay() {
        return pay;
    }

    /**
     * Đặt số tiền.
     * @param pay là số tiền
     */
    public void setPay(double pay) {
        this.pay = pay;
    }

    /**
     * Lấy String.
     * @return String
     */
    @Override
    public String toString() {
        return "Staff[" + super.toString() + ",school=" + school + ",pay=" + pay + "]";
    }
}
