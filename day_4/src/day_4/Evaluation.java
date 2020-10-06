package day_4;

public class Evaluation {

	public static void main(String[] args) {
		Circle circle = new Circle("circle", 5);
		System.out.println(" The area of the circle is " +circle.calculateArea());
		Square square = new Square("square",8);
		System.out.println("The area of square is " +square.calculateArea());
		Rectangle rectangle = new Rectangle("rectangle",5,6);
		System.out.println("The area of rectangle is " +rectangle.calculateArea());

	}

}
