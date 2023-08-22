public class Cylinder extends Circle {
    private double height = 1.0;

    /**
     * Khai báo ko đối tượng.
     */
    public Cylinder() {

    }

    /**
     * KHai báo với ra.
     * @param radius là bán kính
     */
    public Cylinder(double radius) {
        super(radius);
    }

    /**
     * Khai báo đầy đủ.
     * @param radius là bán kính
     * @param height là chiều cao
     */
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    /**
     * Khai báo đầy đủ.
     * @param radius là bán kính
     * @param height là chiều cao
     * @param color là màu sắc
     */
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    /**
     * Khai báo chiều cao.
     * @return chiều cao
     */
    public double getHeight() {
        return height;
    }

    /**
     * Đặt chiều cao.
     * @param height là chiều cao
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Tính diện tích.
     * @return diện tích
     */
    @Override
    public double getArea() {
        return super.getArea();
    }

    /**
     * Tính thể tích.
     * @return thể tích
     */
    public double getVolume() {
        return height * this.getArea();
    }

    /**
     * Chuyển String.
     * @return string
     */
    @Override
    public String toString() {
        String res = ",height=" + height + "]";
        return "[" + super.toString() + res;
    }
}
