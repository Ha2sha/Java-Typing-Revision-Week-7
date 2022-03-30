package hwweek7_typing_revision;
/**
 * Write a java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately.
 */
public class Program11_DivideByThreeAndFive {
    public static void main(String[] args) {
        System.out.println("Numbers divisible by 3 are: ");
        for(int i=1;i<=100;i++){
            divideByThree(i);
        }
        System.out.println("__________________________________________________________");
        System.out.println("\nNumbers divisible by 5 are: ");
        for(int i=1;i<=100;i++){
            divideByFive(i);
        }
    }

    //Divide by three method
    public static void divideByThree(int num){
        if(num%3==0)
            System.out.print(num+" , ");
    }
    //Divide by Five method
    public static void divideByFive(int num){
        if(num%5==0)
            System.out.print(num+" , ");
    }
}
