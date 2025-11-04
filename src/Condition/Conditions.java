package Condition;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Salary : ");
        int salary = input.nextInt();
        if (salary>10000){
            salary = salary+2000;
        }else {
            salary= salary + 4000;
        }
        System.out.print("Updated Salary is : " + salary);
    }
}