package Assignment;

import java.util.Scanner;

public class Subtract_productand_add_of_digit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your number: ");

        int n= in.nextInt();

        int original = n;
        int product = 1 ;
        int sum= 0;

        while(n>0){
            int digit = n%10;
            product *= digit;
            sum += digit;
             n /=10 ;
        }
        int result = product-sum;
        System.out.println("Difference of Prdouct "+ product + " and sum "+ sum +" is: "+ result);
    }
}
