package shapes;

public class TriangularPrism extends Prism {

    //Constructor
    public TriangularPrism(String baseType, double height, double edgeLength) {
        super(baseType, height, edgeLength);
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
        return baseType +"," + " " + "Height=" + height+"," + " " + "EdgeLength=" + edgeLength;
    }


}
