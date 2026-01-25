package Assignment_3;

import java.util.Scanner;

public class Q7_DivisionProgram {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)){
			System.out.print("Enter Number 1: ");
			int num1 = scanner.nextInt();
			
			System.out.print("Enter Number 2: ");
			int num2 = scanner.nextInt();
			
			int div = num1/num2;
			
			System.out.println("The quotient of " + num1 + "/" + num2 + " = " + div);
		} catch (ArithmeticException e) {
			System.out.println("Division by zero is invalid!!!");
		}
		finally {
			System.out.println("Inside finally block");
		}
	}

}
