
public class Circle {
    private double radius = 1.0;
    private String color = "red";

    protected final double pi = 3.14;

    /**
     * Khai báo mặc định.
     */
    public Circle() {

    }

    /**
     * Khai báo với bán kính.
     * @param radius là bán kính
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Khai báo đầy đỷ.
     * @param radius là bán kính
     * @param color là màu sắc
     */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    /**
     * Lấy bán kính.
     * @return radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * đặt bán kính.
     * @param radius là bán kính
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Đặt màu.
     * @param color là màu
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Lấy màu.
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * Tính diện tích.
     * @return area
     */
    public double getArea() {
        return pi * radius;
    }

    /**
     * In ra thông tin.
     * @return string
     */
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }
}
