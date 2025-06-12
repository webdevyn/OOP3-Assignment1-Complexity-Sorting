package shapes;

import java.util.Comparator;
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

    public abstract double BaseArea();

    public abstract double Volume();

    //implement compareTo() from Comparable<> to compare shapes by height
    @Override
    public int compareTo(ThreeDShape otherShape) {
        return Double.compare(this.height, otherShape.height);
    }

    //create method to compare based on base area
    public static final Comparator<ThreeDShape> BaseAreaComparator = (shape1, shape2) ->  Double.compare(shape1.BaseArea(), shape2.BaseArea());

    //create method to compare based on volume
    public static final Comparator<ThreeDShape> VolumeComparator = (shape1, shape2) -> Double.compare(shape1.Volume(), shape2.Volume());
}
