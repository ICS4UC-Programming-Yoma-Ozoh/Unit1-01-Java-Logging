import java.util.Scanner;

/**

 * This program asks the user for the log size

 * and calculates the amount of logs that can be loaded into the truck.

 * @author Yoma Ozoh

 * @version 1.0

 * @since 2026-09-17

 */
public final class Logging {

    // Class-level constants placed outside of methods.
    /**
     * This constant represent the weight of a log.
     */
    private static final double LOG_WEIGHT = 20.0;
    /**
     * This constant represent the truck capacity in kg.
     */
    private static final double TRUCK_CAPACITY = 1100.0;

    /**
     * This is a private constructor used to satisfy the
     * style checker.
     *
     * @exception IllegalStateException Utility class
     * @see IllegalStateException
     */

    private Logging() {

        throw new IllegalStateException("utility class");

    }


    /**

     * This is the main method.

     *

     * @param args Unused

     */

    public static void main(final String[] args) {

        // Welcome the user
        System.out.println("Welcome, we will be calculating"
        + "how many logs can fit in a truck");
        // tell user the truck capacity and log weight
        System.out.println("The truck capacity is 1100 kg"
        + "and each log weighs 20 kg.");


        System.out.print("Enter the size of the log (0.25 m, 0.5 m, 1 m): ");



        // Using the scanner to get the input from user

        final Scanner scanner = new Scanner(System.in);

        final String radstring = scanner.nextLine();
        try {

            // Convert the string to a double

            final double radDouble = Double.parseDouble(radstring);



            // If log size is invalid, tell the user to input
            // a valid log size of 0.25, 0.5, or 1

            if (radDouble != 1 && radDouble != 0.5 && radDouble != 0.25) {

                System.out.println("Invalid log size."
                + "Please enter 0.25, 0.5, or 1.");

            } else {

                // Calculate the log weight

                final double userLogWeight = (4.0 * LOG_WEIGHT);
                final double logsInTruck = (TRUCK_CAPACITY / userLogWeight);

                // Display the amount of logs that can fit in the truck,
                // rounded to 2 decimal places

                System.out.print("The amount of logs"
                + "that can fit in the truck, ");

                System.out.print(radstring + " is ");

                System.out.format("%.2f", logsInTruck);

                System.out.println("logs.");

            }

        } catch (NumberFormatException e) {

            System.out.println("Invalid input. Please enter a valid input.");

        }

        // Closing Scanner

        scanner.close();

    }

}

