import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Test getNonZeroLenString
        String name = SafeInput.getNonZeroLenString(scanner, "Enter your name");
        System.out.println("Your name is: " + name);

        // Test getInt
        int userInt = SafeInput.getInt(scanner, "Enter any integer");
        System.out.println("You entered: " + userInt);

        // Test getDouble
        double userDouble = SafeInput.getDouble(scanner, "Enter any double");
        System.out.println("You entered: " + userDouble);

        // Test getRangedInt
        int rangedInt = SafeInput.getRangedInt(scanner, "Enter an integer", 1, 10);
        System.out.println("You entered: " + rangedInt);

        // Test getRangedDouble
        double rangedDouble = SafeInput.getRangedDouble(scanner, "Enter a double", 0.5, 10.0);
        System.out.println("You entered: " + rangedDouble);

        // Test getYNConfirm
        boolean confirm = SafeInput.getYNConfirm(scanner, "Do you road rage?");
        System.out.println("You entered: " + (confirm ? "Yes" : "No"));

        // Test getRegExString
         String phoneNumber = SafeInput.getRegExString(scanner, "Enter your phone number (###-###-####)", "^\\d{3}-\\d{3}-\\d{4}$");
        System.out.println("Your phone number is: " + phoneNumber);
    }
}

