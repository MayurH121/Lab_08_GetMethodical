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
    }
}

