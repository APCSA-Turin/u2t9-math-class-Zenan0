public class RightTriangle {
    private double base;
    private double height;

    public RightTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double hypotenuse() {
        double aSqaured = Math.pow(base, 2);
        double bSquared = Math.pow(height, 2);
        double c = Math.sqrt(aSqaured + bSquared);
        return c;
    }
}
