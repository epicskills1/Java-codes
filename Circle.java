import java.lang.Math;
class Circle extends Shape {
    private double radius;
    private String color;
	
    public Circle(Point p1, Point c, String color) {
        this.radius = c.calculateDistance(p1);
        this.color = color;
    }
	
	@Override
    double area() {
        return Math.PI * radius * radius;
    }
	
	@Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }
	
	@Override
    String color() {
        return color;
    }

	@Override
    String compareShape(Shape ob) {
        if (ob instanceof Circle) {
            Circle other = (Circle) ob;
            if (this.area() == other.area() && this.perimeter() == other.perimeter()) {
                return "Matching Circles";
            } else {
                return "Non-matching Circles";
            }
        } else {
            return "Shapes are not of the same type";
        }
    }
}
 
