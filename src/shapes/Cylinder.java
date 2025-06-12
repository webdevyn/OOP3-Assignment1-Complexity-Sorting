package shapes;

public class Cylinder extends ThreeDShape {
    //fields
    private double radius;

    public Cylinder(double height, double radius) {
        super(height);
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
        return "Cylinder{" +
                "radius=" + radius +
                ", height=" + height +
                '}';
    }
}
