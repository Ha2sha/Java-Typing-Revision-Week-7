package hwweek7_typing_revision;

import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */
public class Program16_FindPositiveNegative {
    //Main Method
    public static void main(String[] args) {
        //Scanner declaration for reading console input
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scr.nextInt();
        findPositiveNegativeZero(number);

        //closing scanner class object
        scr.close();
    }

    //Method to find number is positive, negative or zero
    public static void findPositiveNegativeZero(int num) {
        if (num > 0)
            System.out.println(num + " is a Positive Number.");
        else if (num < 0)
            System.out.println(num + " is a Negative Number.");
        else
            System.out.println(num + " is Zero.");
    }

}
