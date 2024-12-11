package exercises.Würfelspiel02;

public enum ShapeSymbol {
    CIRCLE(0),
    SQUARE(4),
    TRIANGLE(3);

    private final int corners;

    ShapeSymbol(int corners) {
        this.corners = corners;
    }
    public int getCorners() {
        return corners;
    }
}
