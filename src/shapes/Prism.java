package shapes;

public abstract class Prism extends ThreeDShape {
    //fields
    protected String baseType;
    protected double edgeLength;

    //constructor
    public Prism(double height, String baseType, double edgeLength) {
        super(height);
        this.baseType = baseType;
        this.edgeLength = edgeLength;
    }

    public String GetBaseType() {
        return baseType;
    }

    public double GetHeight() {
        return height;
    }

    public double GetEdgeLength() {
        return edgeLength;
    }

}
