package com.practical.q2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MerchandiseInventoryTest {
	public static void printInventory(ArrayList<Merchandise> list) {
		for (Merchandise m : list) {
			System.out.println(m);
		}
	}
	
	public static void main(String[] args) {

		ArrayList<Merchandise> list = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\VE00YN351\\Documents\\workspace-spring-tools-for-eclipse-4.32.2.RELEASE\\Training\\src\\com\\practical\\q2\\input.txt"))) {

			String line;

			while ((line = br.readLine()) != null) {
				String[] words = line.split("\\s+");

				String code = words[0];
				int quantity = Integer.parseInt(words[1]);
				double price = Double.parseDouble(words[2]);

				list.add(new Merchandise(code, quantity, price));
			}

			// Sort by itemCode - ascending
			Collections.sort(list, new Comparator<Merchandise>() {
				@Override
				public int compare(Merchandise m1, Merchandise m2) {
					return m1.getItemCode().compareTo(m2.getItemCode());
				}
			});

			System.out.println("Sorted by Item Code (Ascending):");
			printInventory(list);

			// Sort by unitPrice - descending
			Collections.sort(list, new Comparator<Merchandise>() {
				@Override
				public int compare(Merchandise m1, Merchandise m2) {
					return Double.compare(m2.getUnitPrice(), m1.getUnitPrice());
				}
			});

			System.out.println("\nSorted by Price (Descending):");
			printInventory(list);

		} catch (FileNotFoundException e) {
			System.out.println("File Not Found: " + e);
		} catch (IOException e) {
			System.out.println("IO Exception: " + e);
		} catch (Exception e) {
			System.out.println("Exception Occurred: " + e);
		}

	}
}
