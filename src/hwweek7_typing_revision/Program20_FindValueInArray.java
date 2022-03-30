package hwweek7_typing_revision;
/**
 * Write a Java program to test if an array contains a specific
 * value.
 */
public class Program20_FindValueInArray {
    //Main Method
    public static void main(String[] args) {
        //Declaration of Numerical Array
        int numArray[]={123,478,586,478,951,753,256};

        System.out.println(isArrayContains(numArray,586));//returns true
        System.out.println(isArrayContains(numArray,741));//returns false

    }

    //method to find if array contains Value or not?
    public static boolean isArrayContains(int a[],int item){
        boolean isContain=false;
        for (int i=0;i<a.length;i++){
         if(a[i]==item){
             isContain=true;
             break;
         }
        }
        return isContain;
    }
}
