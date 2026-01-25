package Assignment_4_Q4;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Tester {

	public static void main(String[] args) {
		Product p1 = new Product(1, "Bottle", 670.5);
		Product p2 = new Product(2, "Laptop", 87500.5);
		Product p3 = new Product(3, "Charger", 500.0);
		
		Queue<Product> pq = new PriorityQueue<>(
				Comparator.comparingDouble(Product::getProductPrice)
		);
		
		pq.add(p1);
		pq.add(p2);
		pq.add(p3);
		
		System.out.println(pq);
		
	}

}
