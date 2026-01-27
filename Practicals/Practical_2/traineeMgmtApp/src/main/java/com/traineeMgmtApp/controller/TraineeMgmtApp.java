package com.traineeMgmtApp.controller;

import java.util.Scanner;

import com.traineeMgmtApp.entity.Trainee;
import com.traineeMgmtApp.service.TraineeService;
import com.traineeMgmtApp.service.TraineeServiceImpl;

public class TraineeMgmtApp {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			TraineeService ts = new TraineeServiceImpl();

			while (true) {
				System.out.println("\n=== Trainee Management ===");
				System.out.println("1. Add Trainee");
				System.out.println("2. Find Trainee by Id");
				System.out.println("0. Exit");

				System.out.print("Enter your choice: ");
				int choice = sc.nextInt();

				switch (choice) {
				case 1:
					sc.nextLine();
					System.out.print("Name: ");
					String name = sc.nextLine();

					System.out.print("Branch: ");
					String branch = sc.next();

					System.out.print("Percentage: ");
					Double percentage = sc.nextDouble();

					Trainee trainee = new Trainee(name, branch, percentage);
					ts.addTrainee(trainee);

					System.out.println("Trainee added successfully...");
					break;

				case 2:
					try {
						System.out.print("Id: ");
						Trainee t = ts.getTraineeById(sc.nextInt());
						System.out.println(t);
					} catch (RuntimeException e) {
						System.out.println("Error: " + e.getMessage());
					}
					break;

				case 0:
					return;

				default:
					System.out.println("Don't be oversmart. Enter valid choice...");
					break;
				}
			}
		} finally {
			System.out.println("Exiting the program...");
		}
	}

}
