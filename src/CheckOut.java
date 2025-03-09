import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double totalCost = 0.0;
        boolean moreItems = true;

        System.out.println("Welcome to the $10 Store!");

        while (moreItems) {
            double itemPrice = SafeInput.getRangedDouble(in, "Enter the price of the item", 0.50, 10.00);


            totalCost += itemPrice; // Add the item price to the total cost


            moreItems = SafeInput.getYNConfirm(in, "Do you have more items?"); // Use SafeInput to ask if the user has more items
        }

        System.out.printf("\nYour total cost is: $%.2f%n", totalCost); // Display the total cost to 2 decimal places
    }
}