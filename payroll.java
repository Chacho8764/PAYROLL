
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class payroll {
    // PROF TAX rate as a constant
    private static final double PROF_TAX_RATE = 0.20;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Employee Number: ");
        int employeeNumber = input.nextInt();
        input.nextLine(); // Consume the newline character

        System.out.print("Enter Employee Name: ");
        String employeeName = input.nextLine();

        System.out.print("Enter Designation: ");
        String designation = input.nextLine();

        System.out.print("Enter Days Worked: ");
        int daysWorked = input.nextInt();

        System.out.print("Enter Pay Rate: ");
        double payRate = input.nextDouble();

        // Get the current date
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        String generationDate = dateFormat.format(date);

        // Calculate basic pay
        double basicPay = daysWorked * payRate;

        // Calculate P.F (Provident Fund)
        double pf = basicPay / 10;

        // Calculate PROF TAX
        double profTax = basicPay * PROF_TAX_RATE;

        // Display the output
        System.out.println("\nPayroll Computation");
        System.out.println("Employee Number: " + employeeNumber);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Designation: " + designation);
        System.out.println("Days Worked: " + daysWorked);
        System.out.println("Pay Rate: " + payRate);
        System.out.println("Generation Date: " + generationDate);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("P.F (Provident Fund): " + pf);
        System.out.println("PROF TAX: " + profTax);

        // Close the scanner
        input.close();
    }



}
