package hwweek7_typing_revision;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */
public class Program17_SortingArray {
    public static void main(String[] args) {
        //Numeric Array Declaration
        int numArray[] = {1987, 1965, 1253, 7412, 8254, 2396, 3352, 4200, 5374};

        //String Array Declaration
        String strArray[] = {"Peter", "Delta", "Hotel", "Mike", "Bravo", "Sierra", "Alpha", "Kilo"};
        System.out.println("_________________________________________________________________________________");
        System.out.println("Actual Numeric Array was: " + Arrays.toString(numArray));
        //sorting numerical Array
        Arrays.sort(numArray);
        System.out.println("Sorted Numerical Array is: " + Arrays.toString(numArray));
        System.out.println("_________________________________________________________________________________");
        System.out.println("Actual String Array was: " + Arrays.toString(strArray));
        //sorting String Array
        Arrays.sort(strArray);
        System.out.println("Sorted String Array is: " + Arrays.toString(strArray));
        System.out.println("_________________________________________________________________________________");
    }
}
