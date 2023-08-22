public class Triangle implements GeometricObject {
    private Point p1;
    private Point p2;
    private Point p3;

    /**
     * kshdfjhs.
     *
     * @param p1 hfs
     * @param p2 hsdf
     * @param p3 sdhfh
     * @throws RuntimeException bshdgfh
     */
    public Triangle(Point p1, Point p2, Point p3) throws RuntimeException {
        if (p1.equals(p2) || p2.equals(p3) || p3.equals(p1)) {
            throw new RuntimeException();
        }
        double s1 = p1.distance(p2);
        double s2 = p2.distance(p3);
        double s3 = p3.distance(p1);
        if (s1 + s2 <= s3 || s1 + s3 <= s2 || s2 + s3 <= s1) {
            throw new RuntimeException();
        }

        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;

    }

    /**
     * shfsh.
     *
     * @return sdh
     */
    public Point getP1() {
        return p1;
    }

    /**
     * sjdhfj.
     *
     * @return shfj
     */
    public Point getP2() {
        return p2;
    }

    /**
     * sjdhfj.
     *
     * @return shfj
     */
    public Point getP3() {
        return p3;
    }

    /**
     * jshf.
     *
     * @return hsgf
     */
    @Override
    public double getArea() {
        return Math.abs(p1.getPointX() * (p2.getPointY() - p3.getPointY())
                + p2.getPointX() * (p3.getPointY() - p1.getPointY())
                + p3.getPointX() * (p1.getPointY() - p2.getPointY())) / 2;
    }

    /**
     * fsjhfj.
     *
     * @return sgfh
     */
    @Override
    public double getPerimeter() {
        return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
    }

    /**
     * shfjhs.
     *
     * @return sjdhfj
     */
    @Override
    public String getInfo() {
        return "Triangle[" + p1.toString() + "," + p2.toString()
                + "," + p3.toString() + "]";
    }
}
