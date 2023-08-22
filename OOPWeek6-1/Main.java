public class Main {
    public static void main(String[] args) {
        Layer lay = new Layer();
        lay.addShape(new Circle(new Point(10.0, 5.0),8.0, "RED", true));
        lay.addShape(new Rectangle(new Point(8,9),10.6, 15.4, "RED", true));
        lay.addShape(new Square(new Point(8,9), 10.6,"RED",true));
        lay.addShape(new Circle(new Point(8, 9),3.0, "BLUE", true));
        lay.addShape(new Circle(new Point(8, 9),3.0, "RED", true));
        lay.removeDuplicates();
        System.out.println(lay.getInfo());
    }
}