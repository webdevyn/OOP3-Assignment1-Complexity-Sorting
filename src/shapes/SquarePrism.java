package shapes;

public class SquarePrism extends Prism {

    //Constructor
    public SquarePrism(double height, String baseType, double edgeLength) {
        super(height, baseType, edgeLength);
    }

    @Override
    public double BaseArea() {
        double baseArea = Math.pow(edgeLength, 2);
        return baseArea;
    }

    @Override
    public void Volume() {
        double volume = Math.pow(edgeLength, 2) * height;
    }

    @Override
    public String toString() {
        return "SquarePrism{" +
                "baseType='" + baseType + '\'' +
                ", height=" + height +
                ", edgeLength=" + edgeLength +
                '}';
    }


}
