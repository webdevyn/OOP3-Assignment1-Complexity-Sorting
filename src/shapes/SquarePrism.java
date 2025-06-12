package shapes;

public class SquarePrism extends Prism {

    //Constructor
    public SquarePrism(String baseType, double height, double edgeLength) {
        super(baseType, height, edgeLength);
    }

    @Override
    public double BaseArea() {
        double baseArea = Math.pow(edgeLength, 2);
        return baseArea;
    }

    @Override
    public double Volume() {
        double volume = Math.pow(edgeLength, 2) * height;
        return volume;
    }

    @Override
    public String toString() {
        return baseType +"," + " " + "Height=" + height+"," + " " + "EdgeLength=" + edgeLength;
    }


}
