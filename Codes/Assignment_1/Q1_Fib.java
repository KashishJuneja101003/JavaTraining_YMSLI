
import java.util.Scanner;

public class Q1_Fib {
    private static void generateFibonacciSeries(int x) {
        if (x < 0) {
            System.out.println("Value should not be negative");
        } else if (x == 0) {
            System.out.println(0);
        } else if (x == 1) {
            System.out.println(1);
        } else {
            int series[] = new int[x];
            int sum = 1;

            series[0] = 0;
            series[1] = 1;

            for (int i = 2; i < x; i++) {
                series[i] = series[i - 1] + series[i - 2];
            }

            System.out.println("Printing series for first " + x + " Fibonacci numbers...");
            for (int el : series) {
                System.out.print(el + " ");
                sum += el;
            }

            double avg = sum / x;
            System.out.println("\nAverage of the series: " + avg);
        }

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of n: ");
            int n = sc.nextInt();

            generateFibonacciSeries(n);
        } catch (Exception e) {
            System.out.println("Exception Occurred: " + e);
        }
    }
}
