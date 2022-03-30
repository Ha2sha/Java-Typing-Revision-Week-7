package hwweek7_typing_revision;

import java.util.Scanner;

/**
 * Input any alphabet from “A to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
public class Program08_PrintCityName {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter alphabet between A to F: ");
        char city = scr.next().charAt(0);
        //object creation to call instance method
        Program08_PrintCityName cityName = new Program08_PrintCityName();
        cityName.printCityName(city);

        //closed scanner object
        scr.close();
    }

    //printing city name
    public void printCityName(char city) {
        if (city == 'a' || city == 'A') {
            System.out.println("Aberdeen");
        } else if (city == 'b' || city == 'B') {
            System.out.println("Belfast");
        } else if (city == 'c' || city == 'C') {
            System.out.println("Cambridge");
        } else if (city == 'd' || city == 'D') {
            System.out.println("Derby");
        } else if (city == 'e' || city == 'E') {
            System.out.println("Edinburgh");
        } else if (city == 'f' || city == 'F') {
            System.out.println("Feltham");
        } else {
            System.out.println("The alphabet you enter is not between A to F");
        }
    }
}
