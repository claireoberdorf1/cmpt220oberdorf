package lab7;

public class Circle {
    double x = 0;
    double y = 0;
    double radius = 1;

    Circle() {
    }

    Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    //Getters
    double getx() {
    	return x;
    }

    double gety() {
    	return y;
    }
    
    //Radius method
    double getRadius() {
    	return radius;
    }
 
    //Area method
    double getArea() {
        return Math.PI * radius * radius;
    }
    
    //Perimeter method
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    
    //Contains
    boolean contains(double x, double y) {
        return distance(this.x, x, this.y, y) <= radius;
    }
    
    //Contains
    boolean contains(Circle circle) {
        return distance(x, circle.getx(), y, circle.gety()) + circle.getRadius() <= radius;
    }
    
    //Overlaps
    boolean overlaps(Circle circle) {
        return distance(x, circle.getx(), y, circle.gety()) - circle.getRadius() <= radius;
    }
    
    //Distance
    static double distance(double x1, double x2, double y1, double y2) {
        double dx = x2-x1, dy = y2-y1;
        return Math.sqrt(dx*dx + dy*dy);
    }
}
