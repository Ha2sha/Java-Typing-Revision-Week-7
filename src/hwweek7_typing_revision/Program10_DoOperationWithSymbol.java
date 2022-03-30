package hwweek7_typing_revision;

import java.util.Scanner;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */
public class Program10_DoOperationWithSymbol {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int num1=scr.nextInt();
        System.out.println("Enter 2nd Number: ");
        int num2=scr.nextInt();
        System.out.println("Please select the calculation symbol +, -, *, / : ");
        char symbol=scr.next().charAt(0);
        doOperationBySelectingSymbol(num1,num2,symbol);

        //closing scanner object
        scr.close();
    }
    public static void doOperationBySelectingSymbol(int x, int y, char symbol){
        if(symbol=='+'){
            System.out.println(x+ " + "+y+" = "+(x+y));
        }
        else if(symbol=='-'){
            System.out.println(x+ " - "+y+" = "+(x-y));
        }else if(symbol=='*'){
            System.out.println(x+ " * "+y+" = "+(x*y));
        }else if(symbol=='/'){
            System.out.println(x+ " / "+y+" = "+(x/y));
        }else{
            System.out.println("Please enter the correct Symbol +,-,*,/");
        }
    }
}
