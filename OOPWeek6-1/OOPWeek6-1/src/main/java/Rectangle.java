public class Rectangle extends Shape {
    protected Point topLeft;
    protected double width;
    protected double length;

    /**
     * khoi tao.
     */
    public Rectangle() {

    }

    /**
     * khoi tao.
     * @param width la chieu rong
     * @param length la chieu dai
     */
    public Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }

    /**
     * khoi tao.
     * @param width la chieu rong
     * @param length la chieu dai
     * @param color la mau
     * @param filled la day
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    /**
     * khoi tao.
     * @param topLeft dinh trai
     * @param width rong
     * @param length dai
     * @param color mau
     * @param filled day
     */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
        this.topLeft = topLeft;
    }

    /**
     * set diem.
     * @param topLeft dinh
     */
    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    /**
     * get diem.
     * @return diem
     */
    public Point getTopLeft() {
        return topLeft;
    }

    /**
     * get chieu rong.
     * @return chieu rong
     */
    public double getWidth() {
        return width;
    }

    /**
     * get chieu dai.
     * @return chieu dai
     */
    public double getLength() {
        return length;
    }

    /**
     * set len.
     * @param length la chieu dai
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * set chieu rong.
     * @param width la chieu rong
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * get Area.
     * @return area
     */
    @Override
    public double getArea() {
        return width * length;
    }

    /**
     * get chu vi.
     * @return chu vi
     */
    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    /**
     * get String.
     * @return string
     */
    @Override
    public String toString() {
        return "Rectangle[topLeft=" + topLeft.toString() + ",width=" + width + ",length="
                + length + ",color=" + color + ",filled=" + filled + "]";
    }

    /**
     * so sanh.
     * @param obj doi tuong
     * @return true or false
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Rectangle rec = (Rectangle) obj;
        if (!topLeft.equals(rec.getTopLeft())) {
            return false;
        }
        return Double.compare(rec.getLength(), length) < 0.001
                && Double.compare(rec.getWidth(), width) < 0.001;
    }

    /**
     * hashcode.
     * @return hashcode
     */
    public int hashCode() {
        int res = 109;
        res = (int) (topLeft.hashCode() * 10 + width * 8 + length * 10);
        return res;
    }
}
