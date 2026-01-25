package Assignment_4_Q1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class Q1_WordFrequencyCounter {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\VE00YN351\\Desktop\\Java\\Codes\\Assignment_4\\Story.txt"))){
			Map<String, Integer> freq = new HashMap<>();
			
			String line;
			
			while((line = br.readLine()) != null) {
				String[] wordStrings = line.split("\\s+");
				
				for(String str:wordStrings) {
					freq.put(str, freq.getOrDefault(str, 0)+1);
				}
			}
			
			for(Map.Entry<String, Integer> entry : freq.entrySet()) {
				System.out.println(entry.getKey() + " is present " + entry.getValue() + " times.");
			}
			
			
		} catch (Exception e) {
			System.out.println("Exception Occurred: " + e);
		}
	}

}
