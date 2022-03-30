package hwweek7_typing_revision;

import java.util.Arrays;

/**
 * Write a Java program to sum values of an array.
 */
public class Program18_SumOfArrays {
    public static void main(String[] args) {
        //Numeric Array Declaration
        int numArray[]={752,632,452,784,986,102,408,789};
        int sum=0;
        //Calculating sum of Array using for loop
        for(int i=0;i<numArray.length;i++){
            sum=sum+numArray[i];
        }
        System.out.println("Values of the elements of the array are: " + Arrays.toString(numArray));
        System.out.println("Sum of all the values of the array are: " + sum);
    }
}
