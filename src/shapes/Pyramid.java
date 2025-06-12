package shapes;

public class Pyramid extends ThreeDShape {
    //fields
    private double edgeLength;

    public Pyramid(String baseType, double height, double edgeLength) {
        super(baseType, height);
        this.edgeLength = edgeLength;
    }

    @Override
    public double BaseArea() {
        double baseArea = Math.pow(edgeLength, 2);
        return baseArea;
    }

    @Override
    public double Volume() {
        double volume = (1/3) * Math.pow(edgeLength, 2) * height;
        return volume;
    }

    @Override
    public String toString() {
        return baseType +"," + " " + "Height=" + height+"," + " " + "EdgeLength=" + edgeLength;
    }
}
