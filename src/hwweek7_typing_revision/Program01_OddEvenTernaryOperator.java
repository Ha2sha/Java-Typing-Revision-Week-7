package hwweek7_typing_revision;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */
public class Program01_OddEvenTernaryOperator {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scr = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int num = scr.nextInt(); //reading user input from console
        isItOddOrEvenNumber(num);
        scr.close();//closing Scanner Class Object
    }

    public static void isItOddOrEvenNumber(int num) {
        //using ternary operator
        String evenOrOdd = num % 2 == 0 ? "Even" : "Odd";
        System.out.println("The " + num + " is " + evenOrOdd + " number");
    }
}
