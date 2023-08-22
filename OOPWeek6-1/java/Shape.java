public abstract class Shape {
    protected String color;
    protected boolean filled;

    /**
     * khoi tao.
     */
    public Shape() {

    }

    /**
     * Khoi tao hinh.
     * @param color la mau
     * @param filled la
     */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /**
     * dat mau.
     * @return mau
     */
    public String getColor() {
        return color;
    }

    /**
     * set mau.
     * @param color la mau
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * dat day.
     * @return day
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * set day.
     * @param filled la day
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * lop ke thua dien tich.
     * @return dien tich
     */
    public abstract double getArea();

    /**
     * lop ke thua chu vi.
     * @return chu vi
     */
    public abstract double getPerimeter();

    /**
     * lop ke thua string.
     * @return string
     */
    public  String toString() {
        return "Shape[color=" + color + ",filled=" + filled + "]";
    }
}
