import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Layer {
    private List<Shape> shapes;

    public Layer() {
        shapes = new ArrayList<>();
    }

    /**
     * them shape.
     *
     * @param shape la hinh
     */
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /**
     * xoa hinh tron.
     */
    public void removeCircles() {
        shapes.removeIf(shape -> shape instanceof Circle);
    }

    /**
     * in Info.
     *
     * @return info
     */
    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Layer of crazy shapes:\n");
        for (Shape shape : shapes) {
            sb.append(shape.toString()).append("\n");
        }
        return sb.toString();
    }

    /**
     * xoa trung lap.
     */
    public void removeDuplicates() {
        Set<Shape> st = new HashSet<>();
        List<Shape> dup = new ArrayList<>();
        for (Shape shape : shapes) {
            if (st.add(shape)) {
                dup.add(shape);
            }
        }
        shapes = dup;
    }
}
