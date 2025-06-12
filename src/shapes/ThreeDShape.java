package shapes;

import java.util.List;

public abstract class ThreeDShape implements Comparable<ThreeDShape> {
    //fields
    protected String baseType;
    protected double height;

    //Constructor
    public ThreeDShape(String baseType, double height) {
        this.baseType = baseType;
        this.height = height;
    }

    //getter
    public String getBaseType() {
        return baseType;
    }

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
