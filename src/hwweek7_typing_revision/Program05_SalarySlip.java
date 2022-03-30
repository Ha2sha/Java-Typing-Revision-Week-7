package hwweek7_typing_revision;

import java.util.Scanner;

/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following format
 * _______________________________
 * | Salary Slip |
 * |______________________________|
 * | Employee Id : 2564 |
 * | Employee Name : Jay |
 * |______________________________|
 * | Basic Salary : 25000.0 |
 * | HRA 10% : 2500.0 |
 * | DA 8% : 2250.0 |
 * | TA 9% : 2000.0 |
 * | PF - 20%; : 5000.0 |
 * |______________________________|
 * | Gross Salary : 26750.0 |
 * |===========================|
 */
public class Program05_SalarySlip {
    public static void main(String[] args) {
        //Scanner declaration for console input
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name=scr.next();
        System.out.println("Enter your Employee ID: ");
        int employeeID=scr.nextInt();
        System.out.println("Enter your basic salary: ");
        double basicSalary=scr.nextDouble();

        //calculating HRA, TS,DA & PF
        double hRA=calculateHRA(basicSalary);
        double dA= calculateDA(basicSalary);
        double tA=calculateTA(basicSalary);
        double pF=calculatePF(basicSalary);

        //calculating Gross salary
        double grossSalary=basicSalary+hRA+tA+dA-pF;
        System.out.println("---------------------------------------");
        System.out.println("|Salary Slip                          |");
        System.out.println("|-------------------------------------|");
        System.out.println("|Employee ID:" + employeeID + "                     |");
        System.out.println("|Employee Name:" + name + "                    |");
        System.out.println("|-------------------------------------|");
        System.out.println("|Basic Salary: " + basicSalary + "                |");
        System.out.println("|HRA 10%     : " + hRA + "                 |");
        System.out.println("|TA 8%       : " + tA + "                 |");
        System.out.println("|DA 9%       : " + dA + "                 |");
        System.out.println("|PF -20%     : " + pF + "                |");
        System.out.println("|-------------------------------------|");
        System.out.println("|Gross Salary: " + grossSalary + "                |");
        System.out.println("|-------------------------------------|");

        //closing scanner object
        scr.close();
    }
    //Calculating HRA
    public static double calculateHRA(double basicSalary){
        return (basicSalary*10)/100;
    }
    //Calculating DA
    public static double calculateDA(double basicSalary){
        return (basicSalary*8)/100;
    }
    //Calculating TA
    public static double calculateTA(double basicSalary){
        return (basicSalary*9)/100;
    }
    //Calculating PF
    public static double calculatePF(double basicSalary){
        return (basicSalary*20)/100;
    }

}

