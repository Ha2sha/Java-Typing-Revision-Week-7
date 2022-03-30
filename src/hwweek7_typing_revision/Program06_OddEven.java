package hwweek7_typing_revision;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */
public class Program06_OddEven {
    public static void main(String[] args) {
        //Scanner declaration for console input
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter any Number: ");
        int num =scr.nextInt();
        Program06_OddEven obj=new Program06_OddEven();
        System.out.println("The number "+num+ " is "+ obj.isEvenOrOddNumber(num)+" number");
        //closing the Scanner Object
        scr.close();
    }

    public String isEvenOrOddNumber(int num){
        if(num%2==0)
            return "Even";
        else
            return "Odd";
    }
}
