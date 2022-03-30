package hwweek7_typing_revision;

import java.util.Scanner;

/**
 * Input any alphabet from “A to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry USING SWITCH STATEMENT
 */
public class Program09_PrintCityNameWithSwitch {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter alphabet between A to F: ");
        String city = scr.next().toUpperCase();

        //creating object to call instance method
        Program09_PrintCityNameWithSwitch cityName = new Program09_PrintCityNameWithSwitch();
        cityName.printCityName(city);

        //closing scanner object
        scr.close();
    }

    public void printCityName(String city) {
        switch (city) {
            case "A":
                System.out.println("Aberdeen");
                break;
            case "B":
                System.out.println("Belfast");
                break;
            case "C":
                System.out.println("Cambridge");
                break;
            case "D":
                System.out.println("Derby");
                break;
            case "E":
                System.out.println("Edinburgh");
                break;
            case "F":
                System.out.println("Feltham");
                break;
            default:
                System.out.println("The alphabet you enter is not between A to F");
        }
    }
}
