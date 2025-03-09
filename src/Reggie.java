import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String ssn = SafeInput.getRegExString(in, "Enter your SSN (###-##-####)", "^\\d{3}-\\d{2}-\\d{4}$"); // Prompt for SSN
        System.out.println("Your SSN is: " + ssn);

        String mNumber = SafeInput.getRegExString(in, "Enter your UC Student M number (M#####)", "^(M|m)\\d{5}$"); // Prompt for UC Student M number
        System.out.println("Your UC Student M number is: " + mNumber);

        String menuChoice = SafeInput.getRegExString(in, "Enter a menu choice (O=Open, S=Save, V=View, Q=Quit)", "^[OoSsVvQq]$");
        System.out.println("Your menu choice is: " + menuChoice.toUpperCase()); // Prompt for menu choice
    }
}