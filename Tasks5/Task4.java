import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        // Create Scanner to take user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your  Birth Date(yyyy-mm-dd): ");

        // Read the input String & parse it to LocalDate
        String input = sc.nextLine();
        LocalDate birthDate = LocalDate.parse(input); // Convert String to LocalDate

        // Get today's date
        LocalDate currenDate = LocalDate.now();

        // Calculate the period between birthDate and currentDate
        Period age = Period.between(birthDate, currenDate);

        // Print age in years, months and days
        System.out.printf("Your Age is: %d years, %d months, and %d days.%n", age.getYears(),
                age.getMonths(), age.getDays());
    }
}
