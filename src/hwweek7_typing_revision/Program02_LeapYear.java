package hwweek7_typing_revision;

import java.util.Scanner;

public class Program02_LeapYear {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scr = new Scanner(System.in);
        System.out.println("Please enter the year: ");
        int year = scr.nextInt();
        Program02_LeapYear leapyear = new Program02_LeapYear();
        leapyear.isLeapYear(year);
        //closing scanner object
        scr.close();
    }

    //checking if it is a Leap Year or not
    public void isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("The year " + year + " is leap year ");
            return;
        }
        System.out.println("The year " + year + " is not a leap year ");

    }
}
