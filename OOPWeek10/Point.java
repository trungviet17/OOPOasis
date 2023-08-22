public class Point {
    private double pointX;
    private double pointY;

    /**
     * jshfhhfhs.
     *
     * @param x hjshf
     * @param y hsdfh
     */
    public Point(double x, double y) {
        pointX = x;
        pointY = y;
    }

    /**
     * fjjshfjh.
     *
     * @param pointY shfh
     */
    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * jshfhs.
     *
     * @param pointX shgfhs
     */
    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    /**
     * sjhfhs.
     *
     * @return hsfhj
     */
    public double getPointY() {
        return pointY;
    }

    /**
     * jshfhs.
     *
     * @return sfh
     */
    public double getPointX() {
        return pointX;
    }

    /**
     * sjhfhsj.
     *
     * @param other fhsgdfh
     * @return hshfj
     */
    public double distance(Point other) {
        return Math.sqrt(Math.pow(this.pointX - other.getPointX(), 2)
                + Math.pow(this.pointY - other.getPointY(), 2));
    }

    /**
     * ksjhfhs.
     *
     * @return sjhfhs
     */
    public String toString() {
        return "(" + String.format("%.2f", pointX) + "," + String.format("%.2f", pointY) + ")";
    }

    /**
     * shdfh.
     *
     * @param other sjhfj
     * @return sjdhfj
     */
    public boolean equals(Point other) {
        return this.getPointX() == other.getPointX() && this.getPointY() == other.getPointY();
    }
}
