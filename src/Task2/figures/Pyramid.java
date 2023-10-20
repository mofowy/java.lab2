package geometry.figures;

public class Pyramid {
    private final double baseArea;
    private final double height;

    public Pyramid(double baseArea, double height) {
        this.baseArea = baseArea;
        this.height = height;
    }

    public double calculateArea() {
        return baseArea + (4 * 0.5 * height * Math.sqrt(baseArea));
    }

    public double calculateVolume() {
        return (1.0 / 3.0) * baseArea * height;
    }
}
