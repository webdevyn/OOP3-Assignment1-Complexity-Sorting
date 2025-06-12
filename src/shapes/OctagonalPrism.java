package shapes;

public class OctagonalPrism extends Prism {

    //Constructor
    public OctagonalPrism(String baseType, double height, double edgeLength) {
        super(baseType, height, edgeLength);
    }

    @Override
    public double BaseArea() {
        double baseArea = 2 * (1 + Math.sqrt(2)) * Math.pow(edgeLength, 2);
        return baseArea;
    }

    @Override
    public double Volume() {
        double volume = BaseArea() * height;
        return volume;
    }

    @Override
    public String toString() {
        return baseType +"," + " " + "Height=" + height+"," + " " + "EdgeLength=" + edgeLength;
    }


}
