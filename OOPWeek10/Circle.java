public class Circle implements GeometricObject {
    public static final double PI = 3.14;
    private Point center;
    private double radius;

    /**
     * jdhsfjh.
     *
     * @param center hfsdh
     * @param radius shdjfh
     */
    public Circle(Point center, double radius) {
        this.radius = radius;
        this.center = center;
    }

    /**
     * jdhfjhs.
     *
     * @param center hfshf
     */
    public void setCenter(Point center) {
        this.center = center;
    }

    /**
     * kdhfjsh.
     *
     * @return hsdhf
     */
    public Point getCenter() {
        return center;
    }

    /**
     * sjhdfjhs.
     *
     * @return fsjhdfj
     */
    public double getRadius() {
        return radius;
    }

    /**
     * jshfhs.
     *
     * @param radius hfshfh
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * sdjhfs.
     *
     * @return hshdfg
     */
    @Override
    public double getArea() {
        return radius * radius * PI;
    }

    /**
     * jshdf.
     *
     * @return hfhsgf
     */
    @Override
    public double getPerimeter() {
        return 2 * radius * PI;
    }

    /**
     * sjdhf.
     *
     * @return gshgdf
     */
    @Override
    public String getInfo() {
        return "Circle[(" + String.format("%.2f", center.getPointX())
                + "," + String.format("%.2f", center.getPointY()) + "),r="
                + String.format("%.2f", radius) + "]";
    }
}
