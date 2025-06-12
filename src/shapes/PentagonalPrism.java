package shapes;

public class PentagonalPrism extends Prism {

    //Constructor
    public PentagonalPrism(double height, String baseType, double edgeLength) {
        super(height, baseType, edgeLength);
    }

    @Override
    public double BaseArea() {
        double radians = Math.toRadians(54);
        double baseArea = (5 * Math.pow(edgeLength, 2) * Math.tan(radians)) / 4;
        return baseArea;
    }

    @Override
    public void Volume() {
        double volume = BaseArea() * height;
    }

    @Override
    public String toString() {
        return "PentagonalPrism{" +
                "baseType='" + baseType + '\'' +
                ", height=" + height +
                ", edgeLength=" + edgeLength +
                '}';
    }


}
