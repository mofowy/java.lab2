package geometry.figures;

public class Square {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return side * side;
    }

    public double calculateVolume() {
        return 0.0;
    }
}
