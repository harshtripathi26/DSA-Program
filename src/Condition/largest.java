package Condition;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your first number : ");
        int a = in.nextInt();
        System.out.println("enter your second number :");
        int b = in.nextInt();
        System.out.println("enter your third number :");
        int c = in.nextInt();
//        Q. find the largest number among 3 ?
        int max = a;
        if (max<b)
            max = b;
        if (max<c)
            max = c;
        System.out.println("Largest number is : "+max);
    }
}
