package Assignment;

import java.util.Scanner;

public class AofTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome Dear!!");
        System.out.println("Which formula you want to use ?");
        System.out.println("1. Using Base and Height.\n"+ "2. Using Heron's Formula");
        int n = in.nextInt();

        if(n==1) {

            // Using Base and Height
            System.out.println("Enter Base(cm): ");
            int base = in.nextInt();
            System.out.println("Enter Height(cm): ");
            int height = in.nextInt();

            int AreaofTriangle = (base * height) * 1 / 2;
            System.out.println("Area of Triangle: " + AreaofTriangle);
        }
        else {

            // Using Heron's Formula
//        Input sides
            System.out.print("Enter side A(cm): ");
            double A = in.nextInt();
            System.out.print("Enter side B(cm): ");
            double B = in.nextInt();
            System.out.print("Enter side C(cm): ");
            double C = in.nextInt();

//        Calculate semi perimeter

            double s = (A + B + C) / 2;

//        use Herons formula

            double AofT = Math.sqrt(s * (s - A) * (s - B) * (s - C));
            System.out.println("Arrea of traingle using Heron's Formula: " + AofT);
        }
        System.out.println("Thankyou!!");
    }
}
