package shapes;

public abstract class Prism extends ThreeDShape {
    //fields
    //protected String baseType;
    protected double edgeLength;

    //constructor
    public Prism(String baseType, double height, double edgeLength) {
        super(baseType, height);
        this.edgeLength = edgeLength;
    }

    public double GetHeight() {
        return height;
    }

    public double GetEdgeLength() {
        return edgeLength;
    }

}
