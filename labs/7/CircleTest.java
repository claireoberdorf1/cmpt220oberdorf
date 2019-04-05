package lab7;

public class CircleTest {
	public static void main(String[] args) {
        Circle c1 = new Circle(2, 2, 5.5);
        Circle c2 = new Circle(4, 5, 10.5);
        Circle c3 = new Circle(3, 5, 2.3);
        System.out.println("c1's area = " + c1.getArea());
        System.out.println("c1's perimeter = " + c1.getPerimeter());
        System.out.println("Does c1 contain (3,3)? " + c1.contains(3, 3));
        System.out.println("Does c1 contain c2? " + c1.contains(c2));
        System.out.println("Does c1 overlap c3? " + c1.overlaps(c3));
    }

}

