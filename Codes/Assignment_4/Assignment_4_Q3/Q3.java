package Assignment_4_Q3;

import java.io.BufferedReader;
import java.io.FileReader;

public class Q3 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\VE00YN351\\Documents\\workspace-spring-tools-for-eclipse-4.32.2.RELEASE\\Training\\src\\Assignment_4_Q3\\input"))){
			String line;
			double maxDouble = Double.MIN_VALUE;
			while((line = br.readLine()) != null) {
				Double d = Double.parseDouble(line);
				maxDouble = Math.max(maxDouble, d);
			}
			
			System.out.println("Maximum Double: " + maxDouble);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
