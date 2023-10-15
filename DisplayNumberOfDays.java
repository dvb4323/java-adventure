//Exercise 4: A program that displays the number of days of a month
import java.util.Scanner;
public class DisplayNumberOfDays {
    public static void main(String[] args) {
        //Create a scanner object
        Scanner scanner = new Scanner(System.in);

        //Create variables
        int month, year;
        int days = 0;

        //Enter the month, if the month is invalid then ask the user to enter again
        do {
            System.out.print("Enter the month (1-12): ");
            month = scanner.nextInt();
        } while (month < 1 || month > 12);

        //Enter the year, if the year is invalid then ask the user to enter again
        do {
            System.out.print("Enter the year: ");
            year = scanner.nextInt();
        } while (year < 0);

        //Display the number of days of a month
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                days = 31;
                break;
            case 4, 6, 9, 11:
                days = 30;
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
        }

        System.out.println("Number of days: " + days);
    }
}

