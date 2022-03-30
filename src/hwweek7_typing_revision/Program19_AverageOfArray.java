package hwweek7_typing_revision;

import java.util.Arrays;

/**
 * Write a Java program to calculate the average value of array
 */
public class Program19_AverageOfArray {
    public static void main(String[] args) {
        //Declaration of Numeric Array
        int numArray[] = {123, 456, 789, 741, 852, 963};
        int sum = 0;
        //calculating sum of all elements of Array using for loop
        for (int i = 0; i < numArray.length; i++) {
            sum = sum + numArray[i];
        }
        //Calculating average of Array values
        int average = sum / numArray.length;
        System.out.println("Values of the elements of the array are: " + Arrays.toString(numArray));
        System.out.println("Average of all the values of the array are: " + average);
    }
}
