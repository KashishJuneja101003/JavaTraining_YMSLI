package circle;

import java.util.ArrayList;

public class TestCircle {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		
		Circle c2 = new Circle(2);
		c2.setColor("pink");
		
		ArrayList<Circle> circles = new ArrayList<>();
		circles.add(c1);
		circles.add(c2);
		
		for(Circle circle : circles) {
			System.out.println(circle);
		}
	}

}
