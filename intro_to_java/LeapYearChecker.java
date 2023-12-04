package intro_to_java;
public class LeapYearChecker {

    public static void main(String[] args) {
        int year = 2024;

        boolean isLeap = isLeapYear(year);

        if (isLeap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    // Method to check if a year is a leap year or not
    public static boolean isLeapYear(int year) {
        // Check if the year is divisible by 400 or divisible by 4 and not divisible by 100
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
