
import java.util.Scanner;

public class Q4_PatternTriangle {

    private static void printPattern(int[][] patternArray) {
        System.out.println("Printing Pattern...");
        for (int[] row : patternArray) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    private static int[][] generatePattern(int rows) {
        int[][] patternArray = new int[rows][];

        for (int row = 1; row <= rows; row++) {
            patternArray[row - 1] = new int[row];

            for (int num = 1; num <= row; num++) {
                patternArray[row - 1][num - 1] = num;
            }
        }

        return patternArray;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of rows: ");
            int rows = sc.nextInt();

            if (rows <= 0) {
                System.out.println("Number of rows must be positive");
            } else {
                int patternArray[][] = generatePattern(rows);
                printPattern(patternArray);
            }

        } catch (Exception e) {
            System.out.println("Exception Occurred: " + e);
            System.out.println("Exiting the program...");
        }
    }
}
