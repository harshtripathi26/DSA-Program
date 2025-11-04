package Assignment;

import java.util.Scanner;

public class AofTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Using Base and Height
        System.out.println("Enter Base(cm): ");
        int base= in.nextInt();
        System.out.println("Enter Height(cm): ");
        int height = in.nextInt();

        int AreaofTriangle = (base * height)*1/2;
        System.out.println("Area of Triangle: " + AreaofTriangle);
    }
}
