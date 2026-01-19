package Assignment_3;

public class Q6_CLA {

    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Usage: java Q6_CLA <name> <age>");
            return;
        }

        String name = args[0];
        int age;

        try {
            age = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Age must be a number");
            return;
        }

        try {
            validateAge(age);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Access granted");

        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void validateAge(int age) throws InvalidAgeException {
        if (age < 18 || age > 59) {
            throw new InvalidAgeException("Age must be between 18 and 59");
        }
    }
}
