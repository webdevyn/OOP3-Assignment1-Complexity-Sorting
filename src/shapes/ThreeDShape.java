package shapes;

public abstract class ThreeDShape implements Comparable<ThreeDShape> {
    //fields
    protected double height;

    //Constructor
    public ThreeDShape(double height) {
        this.height = height;
    }

    //getter
    public double getHeight() {
        return height;
    }

    //implement compareTo() from Comparable<>
    @Override
    public int compareTo(ThreeDShape otherShape) {
        return Double.compare(this.height, otherShape.height);
    }

    public abstract double BaseArea();

    public abstract void Volume();
}
