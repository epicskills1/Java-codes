import java.lang.Math;
class Point{
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calculateDistance(Point other) {
        double deltaX = this.x - other.x;
        double deltaY = this.y - other.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}

class PointDemo{
	public static void main(String[] args){
		Point p1 = new Point(0,0);
		Point p2 = new Point(0,3);
		System.out.println("Distance : " + p1.calculateDistance(p2));
	}
}
