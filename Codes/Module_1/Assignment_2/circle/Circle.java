package circle;

public class Circle {
	private double radius = 1.0;
	private String color = "red";
	
	public Circle() {}
	
	public Circle(double radius) {
		if(radius >= 0) this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if(radius >= 0) this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	public double getCircumference() {
		return 2 * Math.PI * radius;
	}
	
	@Override
	public String toString() {
		return "Radius: " + radius + ", Color: " + color + ", Circumference: " + getCircumference() + ", Area: " + getArea();
	}
}
