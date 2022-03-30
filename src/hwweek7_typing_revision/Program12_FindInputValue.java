package hwweek7_typing_revision;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */
public class Program12_FindInputValue {
    public static void main(String[] args) {
        //Scanner declaration for reading console input
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter any character: ");
        char ch = scr.next().charAt(0);

        //object creation
        Program12_FindInputValue inputValue = new Program12_FindInputValue();
        inputValue.checkInputValueIsAlphabetSymbolOrNumber(ch);
        //closing scanner object
        scr.close();
    }

    public void checkInputValueIsAlphabetSymbolOrNumber(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is an Alphabet.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a Number.");
        } else {
            System.out.println(ch + " is a Symbol");
        }
    }
}
