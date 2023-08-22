
/**
 * Solution class mô tả đối tượng phân số và phép toán phân số.
 */
public class Solution {
    private int numerator;
    private int denominator;

    /**
     * Phương thức khởi tạo mặc định là 1.
     */
    public Solution() {
        denominator = 1;
    }

    /**
     * Phương thức khởi tạo với từ khóa this.
     * @param numerator là tử số
     * @param denominator là mẫu số
     */
    public Solution(int numerator, int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
            this.numerator = numerator;
        } else {
            this.denominator = 1;
            this.numerator = 0;
        }
    }

    /**
     * Phương thức thiết lập tử số.
     * @param numerator là tử số.
     */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /**
     * Phương thức trả về giá trị tử số.
     * @return numerator;
     */
    public int getNumerator() {
        return numerator;
    }


    /**
     * Phương thức nhập giá trị mẫu số.
     * @param denominator là mẫu số.
     */
    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        }
    }

    /**
     * Phương thức lấy giá trị mẫu số.
     * @return denominator.
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * Phương thức tìm ước chung lớn nhất.
     * @param a số nguyên a.
     * @param b số nguyên b.
     * @return ước chung lớn nhất.
     */
    public int gcd(int a, int b) {
        if (a < 0) {
            a = -a;
        }
        if (b < 0) {
            b = -b;
        }
        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        } else {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }
    }

    /**
     * Phương thức rút gọn phân số hiện tại.
     * @return đối tượng được rút gọn.
     */
    public Solution reduce() {
        int num = gcd(denominator, numerator);
        numerator = numerator / num;
        denominator = denominator / num;
        return this;
    }

    /**
     * Phương thức thực hiện cộng phân số.
     * @param p phân số cộng
     * @return phân số sau khi được cộng
     */
    public Solution add(Solution p) {
        int thisdenominator = denominator * p.denominator;
        int thisnumerator = numerator * p.denominator + p.numerator * denominator;
        denominator = thisdenominator;
        numerator = thisnumerator;
        return this;
    }

    /**
     * Phương thức trừ 2 phân số.
     * @param p phần số trừ
     * @return giá trị sau khi trừ
     */
    public Solution subtract(Solution p) {
        int thisdenominator = denominator * p.denominator;
        int thisnumerator = numerator * p.denominator - p.numerator * denominator;
        denominator = thisdenominator;
        numerator = thisnumerator;
        return this;
    }

    /**
     * Phương thức nhân 2 phân số.
     * @param p phân số nhân.
     * @return giá trị sau khi nhân
     */
    public Solution multiply(Solution p) {
        int thisdenominator = denominator * p.denominator;
        int thisnumerator = numerator * p.numerator;
        denominator = thisdenominator;
        numerator = thisnumerator;
        return this;
    }

    /**
     * Phương thức chia 2 phân số.
     * @param p phân số bị chia
     * @return kết quả sau chia
     */
    public Solution divide(Solution p) {
        if (p.numerator != 0) {
            int thisdenominator = denominator * p.numerator;
            int thisnumerator = numerator * p.denominator;
            denominator = thisdenominator;
            numerator = thisnumerator;
            return this;
        }
        return this;
    }


    /**
     * Phương thức so sánh 2 phân số.
     * Kiểm tra đối tượng obj có phải phân số không.
     * @param obj là đối tượng so sánh
     * @return trả về true nếu bằng nhau và sai nếu ngược lại.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Solution) {
            Solution other = (Solution) obj;
            int check1 = this.numerator * other.denominator;
            int check2 = this.denominator * other.numerator;
            return check1 == check2;
        } else {
            return false;
        }
    }

    public void print() {
        System.out.print(numerator + "/" + denominator);
    }






}
