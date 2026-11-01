public class Task1_2 {
    public static void main(String[] args) {
        Octagon oct = new Octagon();
        oct.setInnerRadius(5.0);
        
        System.out.printf("Радиус: %.1f\n", oct.getInnerRadius());
        System.out.printf("Площадь: %.2f\n", oct.calculateArea());
        System.out.printf("Периметр: %.2f\n", oct.calculatePerimeter());
    }
}

class Octagon {
    private double innerRadius;

    public double getInnerRadius() { return innerRadius; }
    public void setInnerRadius(double innerRadius) { this.innerRadius = innerRadius; }

    public double calculateArea() {
        return 8 * Math.pow(innerRadius, 2) * Math.tan(Math.PI / 8);
    }

    public double calculatePerimeter() {
        double side = 2 * innerRadius * Math.tan(Math.PI / 8);
        return 8 * side;
    }
}
