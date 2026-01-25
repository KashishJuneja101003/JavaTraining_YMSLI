package unifiedPaymentSystem;

import java.util.ArrayList;

public class PaymentApp {

	public static void main(String[] args) {
		Vendor v1 = new Vendor(10001, "Laptop", 10, 49500.70);
		Employee e1 = new SalariedEmployee("SE1", 101, 1000);
		
		ArrayList<Payable> payables = new ArrayList<>();
		payables.add(v1);
		payables.add(e1);
		
		for(Payable pb:payables) {
			System.out.println(pb);
		}
	}

}
