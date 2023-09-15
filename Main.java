public class Main{
    public static void main(String[] args) {
        Point p1 = new Point(1,2);
        Point p2 = new Point(5,2);
		Point p3 = new Point(5,4);
		Point p4 = new Point(1,4);
		Point c = new Point(0,0);
		Point p5 = new Point(5,5); 
        //double distance = point1.calculateDistance(point2);
        //System.out.println("Distance between point1 and point2: " + distance);

        Shape triangle1 = new Triangle(p1,p2,p4,"Red");
        Shape triangle2 = new Triangle(p1,p2,p3,"Blue");
        Shape rectangle1 = new Rectangle(p1,p2,p3,p4,"Green");
        //Shape rectangle2 = new Rectangle(6, 7, "Yellow");
        Shape circle1 = new Circle(c,p5, "Orange");
        Shape circle2 = new Circle(c,p3, "Purple");

        System.out.println(triangle1.compareShape(triangle2));
        //System.out.println(rectangle1.compareShape(rectangle2));
        System.out.println(circle1.compareShape(circle2));
    }
}
