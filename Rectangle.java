import java.lang.Math;
class Rectangle extends Shape {
    private double length;
    private double width;
    private String color;

    public Rectangle(Point p1, Point p2, Point p3, Point p4, String color) {
        if(p1.calculateDistance(p2) == p3.calculateDistance(p4)){
		    this.length = p1.calculateDistance(p2);
		    this.width = p3.calculateDistance(p2);
		}
		else{
			this.length = 0;
			this.width = 0;
		}
        this.color = color;
    }
	
	@Override
    double area() {
        return length * width;
    }
	
	@Override
    double perimeter() {
        return 2 * (length + width);
    }
	
	@Override
    String color() {
        return color;
    }
	
	@Override
    String compareShape(Shape ob) {
		Rectangle other = (Rectangle) ob;
		if (this.area() == other.area() && this.perimeter() == other.perimeter()) 
			return "Matching Rectangles";
		else
			return "Non-matching Rectangles";
			
   	}
}
