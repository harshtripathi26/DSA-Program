package Condition;

import java.util.Scanner;

public class CountNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = in.nextInt();
        System.out.print("Enter the digit u want to check: ");
        int a = in.nextInt();
        int count = 0 ;

        while (n>0){
            int rem = n%10;
            if (rem==a){
                count++;
            }
            n= n/10;
        }
        System.out.println(count);
        System.out.println("I hope u get your Answer, Thankyou!!");
    }
}


