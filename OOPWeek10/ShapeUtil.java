import java.util.List;

public class ShapeUtil {

    /**
     * sjhfhsdf.
     *
     * @param shapes fhsghf
     * @return sjhdfj
     */
    public String printInfo(List<GeometricObject> shapes) {
        StringBuilder cir = new StringBuilder();
        cir.append("Circle:").append('\n');
        for (GeometricObject shape : shapes) {
            if (shape instanceof Circle) {
                cir.append(((Circle) shape).getInfo()).append("\n");
            }
        }
        StringBuilder tria = new StringBuilder();
        tria.append("Triangle:").append('\n');
        for (GeometricObject shape : shapes) {
            if (shape instanceof Triangle) {
                tria.append(((Triangle) shape).getInfo()).append("\n");
            }
        }
        return cir.toString() + tria.toString();
    }
}
