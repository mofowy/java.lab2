package Task2.calculations;

public class VolumeCalculator {
    public static double calculateVolume(Object figure) {
        if (figure instanceof geometry.figures.Cube) {
            return ((geometry.figures.Cube) figure).calculateVolume();
        } else if (figure instanceof geometry.figures.Pyramid) {
            return ((geometry.figures.Pyramid) figure).calculateVolume();
        } else if (figure instanceof geometry.figures.Sphere) {
            return ((geometry.figures.Sphere) figure).calculateVolume();
            // Додайте обробку інших фігур
        }
        return 0.0;
    }
}
