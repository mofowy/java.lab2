package Task2;

import Task2.calculations.AreaCalculator;
import Task2.calculations.VolumeCalculator;

public class Main {
    public static void main(String[] args) {
        geometry.figures.Triangle triangle = new geometry.figures.Triangle(3, 4, 5);
        geometry.figures.Square square = new geometry.figures.Square(6);
        geometry.figures.Rectangle rectangle = new geometry.figures.Rectangle(4, 8);
        geometry.figures.Cube cube = new geometry.figures.Cube(4);
        geometry.figures.Pyramid pyramid = new geometry.figures.Pyramid(10, 5);
        geometry.figures.Circle circle = new geometry.figures.Circle(3);
        geometry.figures.Sphere sphere = new geometry.figures.Sphere(2);

        double triangleArea = AreaCalculator.calculateArea(triangle);
        double squareArea = AreaCalculator.calculateArea(square);
        double rectangleArea = AreaCalculator.calculateArea(rectangle);
        double cubeVolume = VolumeCalculator.calculateVolume(cube);
        double pyramidVolume = VolumeCalculator.calculateVolume(pyramid);
        double circleArea = AreaCalculator.calculateArea(circle);
        double sphereVolume = VolumeCalculator.calculateVolume(sphere);

        System.out.println("Площа трикутника: " + triangleArea);
        System.out.println("Площа квадрата: " + squareArea);
        System.out.println("Площа прямокутника: " + rectangleArea);
        System.out.println("Об'єм куба: " + cubeVolume);
        System.out.println("Об'єм піраміди: " + pyramidVolume);
        System.out.println("Площа кола: " + circleArea);
        System.out.println("Об'єм сфери: " + sphereVolume);
    }
}
