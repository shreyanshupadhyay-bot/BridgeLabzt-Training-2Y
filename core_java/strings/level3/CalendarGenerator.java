import java.util.Scanner;

public class CalendarGenerator {

    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] monthNames = {"", "January", "February", "March", "April", "May", "June", 
                               "July", "August", "September", "October", "November", "December"};
        return monthNames[month];
    }

    // Method to check if it's a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the number of days in a month
    public static int getDaysInMonth(int month, int year) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month];
    }

    // Method to get the first day of the month (0=Sun, 1=Mon, ..., 6=Sat)
    public static int getStartDay(int month, int day, int year) {
        int y = year;
        int m = month;
        if (m < 3) {
            m += 12;
            y -= 1;
        }
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (day + x + (31 * m0) / 12) % 7;
        return d0;
    }
    
    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        System.out.println("\n   " + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        
        int startDay = getStartDay(month, 1, year);
        int numDays = getDaysInMonth(month, year);
        
        // Print leading spaces for the first week
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }
        
        // Print the days of the month
        for (int day = 1; day <= numDays; day++) {
            System.out.printf("%3d ", day);
            if ((startDay + day) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year (e.g., 2005): ");
        int year = scanner.nextInt();

        displayCalendar(month, year);

        scanner.close();
    }
}
