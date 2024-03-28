package week_five;

import java.util.Scanner;

public class InvestmentCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input initial investment
        System.out.print("Enter initial investment (e.g., 0.01 USD): ");
        double investmentUSD = scanner.nextDouble();

        // Input number of days
        System.out.print("Enter number of days: ");
        int numOfDays = scanner.nextInt();

        // Calculate total amount in USD
        double totalAmountUSD = investmentUSD * Math.pow(2, numOfDays);

        // Conversion rate from USD to KES (Kenya Shillings)
        double exchangeRate = 113.15; // Example exchange rate, you can replace this with the current rate

        // Convert total amount to KES
        double totalAmountKES = totalAmountUSD * exchangeRate;

        // Display the total amount in KES
        System.out.println("Total amount after " + numOfDays + " days: KSh " + totalAmountKES);

        scanner.close();
    }
}