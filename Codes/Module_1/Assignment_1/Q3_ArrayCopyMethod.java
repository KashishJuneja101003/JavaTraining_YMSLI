
import java.util.Scanner;

public class Q3_ArrayCopyMethod {

    private static int[] copyOf(int[] array) {
        int size = array.length;
        int newArray[] = new int[size];

        for (int index = 0; index < size; index++) {
            newArray[index] = array[index];
        }
        return newArray;
    }

    private static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size: ");
            int size = sc.nextInt();
            if (size < 0) {
                System.out.println("Invalid size");
            } else {
                int array[] = new int[size];
                int newArray[] = copyOf(array);

                System.out.println("Address of original array: " + array);
                System.out.println("Address of new array: " + newArray);

                if (size > 0) {
                    System.out.println("Before Modification...");
                    printArray(array);
                    System.out.println();
                    printArray(newArray);

                    System.out.println();

                    newArray[0] = 10;

                    System.out.println("After Modification...");
                    printArray(array);
                    System.out.println();
                    printArray(newArray);
                }
            }

        } catch (Exception e) {
            System.out.println("Exception Occurred: " + e);
            System.out.println("Exiting the program...");
        }

    }
}
