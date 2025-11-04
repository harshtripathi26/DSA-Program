package Condition;

import java.util.Scanner;

public class FIbonacci_series {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Find the nth term of fibonnaci series: ");
        int i = in.nextInt();
        int p = 0;
        int c = 1;
        int count = 2;
        while (count<=i){
            int temp = c;
            c= p+c;
            p = temp;
            count++;
        }
        System.out.println(p);


    }
}
