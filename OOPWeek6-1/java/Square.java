public class Square extends Rectangle {

    /**
     * khoi tao.
     */
    public Square() {

    }

    /**
     * khoi tao.
     * @param side la canh
     */
    public Square(double side) {
        super(side, side);
    }

    /**
     * khoi tao.
     * @param side la canh
     * @param color la mau
     * @param filled la day
     */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    /**
     * khoi tao.
     * @param topLeft la dinh
     * @param side la canh
     * @param color la mau
     * @param filled la day
     */
    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);
    }

    /**
     * lay side.
     * @return side
     */
    public double getSide() {
        return width;
    }

    /**
     * set canh.
     * @param side la canh
     */
    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    /**
     * set width.
     * @param side la chieu rong
     */
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    /**
     * set lenght.
     * @param side la chieu dai
     */
    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    /**
     * set string.
     * @return string
     */
    @Override
    public String toString() {
        return "Square[topLeft=" + topLeft.toString() + ",side=" + width
                + ",color=" + color + ",filled=" + filled + "]";
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
        if (!super.equals(obj)) {
            return false;
        }
        Square sq = (Square) obj;
        return Double.compare(getSide(), sq.getSide()) < 0.001;
    }
}
