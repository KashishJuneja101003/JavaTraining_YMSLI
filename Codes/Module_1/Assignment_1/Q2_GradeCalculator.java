
import java.util.Scanner;

public class Q2_GradeCalculator {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int sum = 0;
            System.out.print("Enter the number of students: ");
            int num = sc.nextInt();

            if (num == 0) {
                System.out.println("Number of students are 0.");
                System.out.println("Exiting the program...");
                return;
            }
            int grades[] = new int[num];
            int idx = 0;

            while (idx < num) {
                System.out.print("Enter grade for student " + (idx + 1) + ": ");
                int grade = sc.nextInt();

                if (grade < 0 || grade > 100) {
                    System.out.println("Invalid grade. Try again.");
                } else {
                    grades[idx] = grade;
                    idx++;
                }
            }

            for (int grade : grades) {
                sum += grade;
            }

            double avg = (double) sum / num;

            System.out.println("Average: " + avg);

        } catch (Exception e) {
            System.out.println("Exception Occurred: " + e);
            System.out.println("Exiting the program...");
        }
    }
}
