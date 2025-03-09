public class CtoFTableDisplay {
    /**
     * Converts a Celsius temperature to Fahrenheit.
     *
     * @param celsius the temperature in Celsius
     * @return the temperature in Fahrenheit
     */
    public static double CtoF(double celsius) {
        return (celsius * 9 / 5) + 32; // C to F Conversion formula
    }

    public static void main(String[] args) {
        System.out.println("Celsius\t\tFahrenheit"); // Table header
        System.out.println("-----------------------------");

        // Loop through Celsius values from -100 to 100
        for (int celsius = -100; celsius <= 100; celsius++) {
            double fahrenheit = CtoF(celsius); // Convert Celsius to Fahrenheit
            System.out.printf("%d°C\t\t%.2f°F%n", celsius, fahrenheit); // Display the result
        }
    }
}