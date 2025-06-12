package shapes;

public class Cone extends ThreeDShape {
    //fields
    private double radius;

    //constructor
    public Cone(double height, double radius) {
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
        double volume = (1/3) * Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public String toString() {
        return "Cone{" +
                "radius=" + radius +
                ", height=" + height +
                '}';
    }
}
