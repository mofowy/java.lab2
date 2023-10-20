package geometry.figures;

public class Cube {
    private final double side;

    public Cube(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return 6 * side * side;
    }

    public double calculateVolume() {
        return side * side * side;
    }
}
