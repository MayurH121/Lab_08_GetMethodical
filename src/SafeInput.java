import java.util.Scanner;

public class SafeInput {
    /**
     * Prompts the user for a non-zero length string input.
     *
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt the message to display as the prompt for the input
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";
        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);
        return retString;
    }

    /**
     * Prompts the user to input any integer and ensures the input is valid.
     *
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt the message to display as the prompt for the input
     * @return a valid integer input by the user
     */
    public static int getInt(Scanner pipe, String prompt) {
        int retInt = 0;
        boolean isValid = false;
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                retInt = pipe.nextInt();
                isValid = true;
            } else {
                System.out.println("Invalid input. Please enter an integer.");
            }
            pipe.nextLine();
        } while (!isValid);
        return retInt;
    }

    /**
     * Prompts the user to input any double value and ensures the input is valid.
     *
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt the message to display as the prompt for the input
     * @return a valid double input by the user
     */
    public static double getDouble(Scanner pipe, String prompt) {
        double retDouble = 0;
        boolean isValid = false;
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble()) {
                retDouble = pipe.nextDouble();
                isValid = true;
            } else {
                System.out.println("Invalid input. Please enter a double.");
            }
            pipe.nextLine();
        } while (!isValid);
        return retDouble;
    }

    /**
     * Prompts the user to input an integer within a specified inclusive range.
     *
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt the message to display as the prompt for the input
     * @param low    the low value for the input range
     * @param high   the high value for the input range
     * @return a valid integer within the specified range
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retInt = 0;
        boolean isValid = false;
        do {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextInt()) {
                retInt = pipe.nextInt();
                if (retInt >= low && retInt <= high) {
                    isValid = true;
                } else {
                    System.out.println("Input out of range. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
            }
            pipe.nextLine();
        } while (!isValid);
        return retInt;
    }

    /**
     * Prompts the user to input a double value within a specified inclusive range.
     *
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt the message to display as the prompt for the input
     * @param low    the low value for the input range
     * @param high   the high value for the input range
     * @return a valid double within the specified range
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double retDouble = 0;
        boolean isValid = false;
        do {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble()) {
                retDouble = pipe.nextDouble();
                if (retDouble >= low && retDouble <= high) {
                    isValid = true;
                } else {
                    System.out.println("Input out of range. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a double.");
            }
            pipe.nextLine();
        } while (!isValid);
        return retDouble;
    }
}