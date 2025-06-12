package shapes;

public class OctagonalPrism extends Prism {

    //Constructor
    public OctagonalPrism(double height, String baseType, double edgeLength) {
        super(height, baseType, edgeLength);
    }

    @Override
    public double BaseArea() {
        double baseArea = 2 * (1 + Math.sqrt(2)) * Math.pow(edgeLength, 2);
        return baseArea;
    }

    @Override
    public void Volume() {
        double volume = BaseArea() * height;
    }

    @Override
    public String toString() {
        return "OctagonalPrism{" +
                "baseType='" + baseType + '\'' +
                ", height=" + height +
                ", edgeLength=" + edgeLength +
                '}';
    }


}
