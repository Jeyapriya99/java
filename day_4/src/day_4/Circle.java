package day_4;

public class Circle extends Shape {
	
	
	private int radius;
	
	
	

	

	public int getRadius() {
		return radius;
	}






	public void setRadius(int radius) {
		this.radius = radius;
	}






	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;
	}






	@Override
	public float calculateArea() {
		float pi = 3.14f;
		float areaOfCircle = pi * radius * radius;
		return areaOfCircle;
		
	}

}
