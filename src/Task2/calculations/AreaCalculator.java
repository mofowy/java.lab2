package Task2.calculations;


public class AreaCalculator {
    public static double calculateArea(Object figure) {
        if (figure instanceof geometry.figures.Triangle) {
            return ((geometry.figures.Triangle) figure).calculateArea();
        } else if (figure instanceof geometry.figures.Square) {
            return ((geometry.figures.Square) figure).calculateArea();
        } else if (figure instanceof geometry.figures.Rectangle) {
            return ((geometry.figures.Rectangle) figure).calculateArea();
        } else if (figure instanceof geometry.figures.Circle) {
            return ((geometry.figures.Circle) figure).calculateArea();
        } else if (figure instanceof geometry.figures.Pyramid) {
            return ((geometry.figures.Pyramid) figure).calculateArea();
        } else if (figure instanceof geometry.figures.Cube) {
            return ((geometry.figures.Cube) figure).calculateArea();
        } else if (figure instanceof geometry.figures.Sphere) {
            return ((geometry.figures.Sphere) figure).calculateArea();
        }
        return 0.0;
    }
}
