package shapes;

public class TriangularPrism extends Prism {

    //Constructor
    public TriangularPrism(double height, String baseType, double edgeLength) {
        super(height, baseType, edgeLength);
    }

    @Override
    public double BaseArea() {
        double baseArea = ((Math.pow(edgeLength, 2)) * (Math.sqrt(3)))/4;
        return baseArea;
    }

    @Override
    public void Volume() {
        double volume = BaseArea() * height;
    }

    @Override
    public String toString() {
        return "TriangularPrism{" +
                "baseType='" + baseType + '\'' +
                ", height=" + height +
                ", edgeLength=" + edgeLength +
                '}';
    }


}
