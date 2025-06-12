package shapes;

public class Cylinder extends ThreeDShape {
    //fields
    private double radius;

    public Cylinder(String baseType, double height, double radius) {
        super(baseType, height);
        this.radius = radius;
    }

    @Override
    public double BaseArea() {
        double baseArea = Math.PI * Math.pow(radius, 2);
        return baseArea;
    }

    @Override
    public void Volume() {
        double volume = Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public String toString() {
        return baseType +"," + " " + "Height=" + height+"," + " " + "Radius=" + radius;
    }
}
