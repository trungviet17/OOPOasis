public class Point {
    private double pointX;
    private double pointY;

    /**
     * khoi tao.
     * @param pointX toa do x
     * @param pointY toa do y
     */
    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    /**
     * get x.
     * @return x
     */
    public double getPointX() {
        return pointX;
    }

    /**
     * get Y.
     * @return y
     */
    public double getPointY() {
        return pointY;
    }

    /**
     * set x.
     * @param pointX la x
     */
    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    /**
     * set Y.
     * @param pointY la y
     */
    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * distance.
     * @param other object
     * @return khoang cach
     */
    public double distance(Point other) {
        return Math.sqrt(Math.pow(other.getPointX() - pointX, 2)
                + Math.pow(other.getPointY() - pointY, 2));
    }

    /**
     * so sanh.
     * @param obj object
     * @return true or false
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Point p = (Point) obj;
        return Double.compare(p.getPointX(), pointX) < 0.001
                && Double.compare(p.getPointY(), pointY) < 0.001;
    }

    /**
     * string.
     * @return string
     */
    public String toString() {
        double roundX = Math.round(pointX * 10) / 10.0;
        double roundY = Math.round(pointY * 10) / 10.0;
        return "(" + roundX + "," + roundY + ")";
    }

    /**
     * hashcode.
     * @return hashcode
     */
    public int hashCode() {
        int res = 36;
        res += pointX * 45 + pointY * 32;
        return res;
    }

}
