
import java.util.Scanner;

public class Q5_NextDateCalculator {

    private static int daysInMonths[] = {-1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    private static void leapYear(int year) {
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) daysInMonths[2] = 29;
        else daysInMonths[2] = 28;
    }

    private static boolean validateDate(int day, int month, int year) {
        if (year < 1000) {
            return false;
        }
        if (month < 1 || month > 12) {
            return false;
        }

        leapYear(year);

        if (day < 1 || day > daysInMonths[month]) {
            return false;
        }
        return true;
    }

    private static int[] calculateNextDate(int[] originalDate){
        int day = originalDate[0];
        int month = originalDate[1];
        int year = originalDate[2];

        if(validateDate(day+1, month, year)){
            day++;
        } else {
            if(validateDate(1, month+1, year)){
                day = 1;
                month++;
            } else {
                day = 1;
                month = 1;
                year++;
                leapYear(year);
            }
        }

        int[] nextDate = {day, month, year};
        return nextDate;
    }
    
    private static void printDate(int[] date){
        int day = date[0];
        int month = date[1];
        int year = date[2];

        System.out.println(day + "/" + month + "/" + year);
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter day: ");
            int day = sc.nextInt();
            System.out.print("Enter month: ");
            int month = sc.nextInt();
            System.out.print("Enter year: ");
            int year = sc.nextInt();

            int[] originalDate = {day, month, year};

            if (!validateDate(day, month, year)) {
                System.out.println("Entered date is invalid");
                System.out.println("Exiting the program...");
                return;
            }

            int[] nextDate = calculateNextDate(originalDate);

            System.out.print("Today: "); printDate(originalDate);
            System.out.print("Next Date: "); printDate(nextDate);            
        } catch (Exception e) {
            System.out.println("Exception Occurred: " + e);
        }
    }
}
