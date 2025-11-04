package Assignment;

import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius(cm): ");
        int radius = in.nextInt();

        double area = 3.14159 * radius * radius;

        System.out.print("Area of Circle: " + area);
    }
}
