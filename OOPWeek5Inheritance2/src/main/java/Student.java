public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    /**
     * Khai báo đầy đủ.
     * @param name là tên
     * @param address là địa chỉ
     * @param program là chương trình
     * @param year là năm
     * @param fee là số
     */
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    /**
     * Lấy chương trình.
     * @return chương trình
     */
    public String getProgram() {
        return program;
    }

    /**
     * Đặt chương trình.
     * @param program là chương trình
     */
    public void setProgram(String program) {
        this.program = program;
    }

    /**
     * Lấy năm.
     * @return năm
     */
    public int getYear() {
        return year;
    }

    /**
     * Đặt năm.
     * @param year là năm
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Đặt fee.
     * @return fee
     */
    public double getFee() {
        return fee;
    }

    /**
     * Đặt fee.
     * @param fee là fee
     */
    public void setFee(double fee) {
        this.fee = fee;
    }

    /**
     * Đặt String.
     * @return string
     */
    @Override
    public String toString() {
        String s1 = "Student[" + super.toString() + ",program=" + program;
        String s2 = ",year=" + year + ",fee=" + fee + "]";
        return s1 + s2;
    }
}
