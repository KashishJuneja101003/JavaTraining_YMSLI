package Assignment_3_Q3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Tester {

	public static void main(String[] args) {
		try {
			System.out.println("Let's serialize the java object...");

			Thread.sleep(2000);

			FileOutputStream fos = new FileOutputStream("serializedFile");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			Address address = new Address("Uttar Pradesh", "Shamli", 247776);
			Employee employee = new Employee(1, "Kashish", address, 1000000000);

			oos.writeObject(employee);

			System.out.println("Employee Object Serialized");

			Thread.sleep(2000);

			System.out.println("Let's deserialize the java object...");

			Thread.sleep(2000);

			FileInputStream fis = new FileInputStream("serializedFile");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Employee newEmployee = (Employee) ois.readObject();

			System.out.print("Deserialized Object: ");
			newEmployee.display();
			
			Thread.sleep(2000);

			System.out.println("Salary is missing in deserialized object. Let's try to access it manually.");

			Thread.sleep(2000);
			System.out.println("Output of 'newEmployee.getSalary()' is " + newEmployee.getSalary());
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
