package shapes;

public class Cone extends ThreeDShape {
    //fields
    private double radius;

    //constructor
    public Cone(String baseType, double height, double radius) {
        super(baseType, height);
        this.radius = radius;
    }

    @Override
    public double BaseArea() {
        double baseArea = Math.PI * Math.pow(radius, 2);
        return baseArea;
    }

    @Override
    public double Volume() {
        double volume = (1/3) * Math.PI * Math.pow(radius, 2) * height;
        return volume;
    }

    @Override
    public String toString() {
        return baseType +"," + " " + "Height=" + height+"," + " " + "Radius=" + radius;
    }
}
