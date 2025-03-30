import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String args[]) {
        // Declare and initialize variables here.
        String employeeName;
        double numTransactions;
        double numShifts;
        double dollarValue;
        double score;
        double bonus = 0;  // Initialize bonus variable
        final double BONUS_1 = 50.00;
        final double BONUS_2 = 75.00;
        final double BONUS_3 = 100.00;
        final double BONUS_4 = 200.00;

        // Use Scanner to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Get employee name
        System.out.print("Enter employee's name: ");
        employeeName = scanner.nextLine();

        // Get number of shifts
        System.out.print("Enter number of shifts: ");
        numShifts = scanner.nextDouble();

        // Get number of transactions
        System.out.print("Enter number of transactions: ");
        numTransactions = scanner.nextDouble();

        // Get transaction dollar value
        System.out.print("Enter transactions dollar value: ");
        dollarValue = scanner.nextDouble();

        // Calculate productivity score
        score = (dollarValue / numTransactions) / numShifts;

        // Determine bonus based on score using nested if statements
        if (score <= 30) {
            bonus = BONUS_1;
        } else if (score >= 31 && score <= 69) {
            bonus = BONUS_2;
        } else if (score >= 70 && score <= 199) {
            bonus = BONUS_3;
        } else if (score >= 200) {
            bonus = BONUS_4;
        }

        // Output results
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Bonus: $" + bonus);

        scanner.close();  // Close the scanner to prevent resource leak
    }
}
