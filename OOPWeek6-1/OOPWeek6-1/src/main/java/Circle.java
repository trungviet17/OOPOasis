public class Circle extends Shape {
    protected Point center;
    protected double radius;

    /**
     * Khoi tao.
     */
    public Circle() {

    }

    /**
     * khoi tao.
     * @param radius la ban kinh
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * khoi tao.
     * @param radius la ban kinh
     * @param color la mau
     * @param filled la day
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * khoi tao.
     * @param center tam
     * @param radius ban kinh
     * @param color mau
     * @param filled day
     */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
        this.center = center;
    }

    /**
     * get tam.
     * @return tam
     */
    public Point getCenter() {
        return center;
    }

    /**
     * set tam.
     * @param center tam
     */
    public void setCenter(Point center) {
        this.center = center;
    }

    /**
     * get ban kinh.
     * @return ban kinh
     */
    public double getRadius() {
        return radius;
    }

    /**
     * set ban kinh.
     * @param radius la ban kinh
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * get dien tich.
     * @return dien tich
     */
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     * get chu vi.
     * @return chu vi
     */
    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    /**
     * tra String.
     * @return string
     */
    @Override
    public String toString() {
        return "Circle[center=" + center.toString() + ",radius=" + radius
                + ",color=" + color + ",filled=" + filled + "]";
    }

    /**
     * so sanh.
     * @param obj la doi tuong
     * @return true or false
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Circle cir = (Circle) obj;
        if (!center.equals(cir.getCenter())) {
            return false;
        }
        return Double.compare(radius, cir.getRadius()) < 0.001;
    }

    /**
     * hashcode.
     * @return hashcodeS
     */
    public int hashCode() {
        int res = 7;
        res *= radius * 5 + center.hashCode() * 65;
        return res;
    }
}
