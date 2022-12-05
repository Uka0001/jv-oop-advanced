package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public String toString() {
        return "Circle{"
                + "radius=" + radius
                + ", color=" + getColor()
                + '}';
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle"
                + ", area:" + getArea()
                + " sq.units"
                + ", radius:" + radius
                + " units"
                + ", color:" + getColor());
    }
}
