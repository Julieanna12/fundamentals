import java.util.Scanner;

public class BadDate {
    public static void main(String args[]) {
        // Declare variables
        String yearString;
        String monthString;
        String dayString;
        int year;
        int month;
        int day;
        boolean validDate = true;
        final int MIN_YEAR = 0, MIN_MONTH = 1, MAX_MONTH = 12, MIN_DAY = 1, MAX_DAY = 31;

        // Use Scanner to get user input from the console
        try(Scanner scanner = new Scanner(System.in))
        {

            // Get year, month, and day from user input
            System.out.print("Enter year: ");
            yearString = scanner.nextLine();
            
            System.out.print("Enter month: ");
            monthString = scanner.nextLine();
            
            System.out.print("Enter day: ");
            dayString = scanner.nextLine();

            // Convert strings to integers
            try {
                year = Integer.parseInt(yearString);
                month = Integer.parseInt(monthString);
                day = Integer.parseInt(dayString);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter numeric values.");
                return;  // Exit the program if the input is not valid
            }

            // Check if the date is valid
            if (year <= MIN_YEAR) {
                validDate = false;  // invalid year
            } else if (month < MIN_MONTH || month > MAX_MONTH) {
                validDate = false;  // invalid month
            } else if (day < MIN_DAY || day > MAX_DAY) {
                validDate = false;  // invalid day
            }

            // Output whether the date is valid or not
            if (validDate) {
                System.out.println(month + "/" + day + "/" + year + " is a valid date.");
            } else {
                System.out.println(month + "/" + day + "/" + year + " is an invalid date.");
            }
        } 
    } // end of main() method
} // end of BadDate class
