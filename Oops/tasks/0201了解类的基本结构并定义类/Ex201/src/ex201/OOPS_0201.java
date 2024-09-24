package ex201;

import java.util.Scanner;

public class OOPS_0201 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        Scanner input = new Scanner(System.in);
        rectangle.width = input.nextDouble();
        rectangle.height = input.nextDouble();

        System.out.printf("%.2f,%.2f\n",rectangle.getPerimeter(),rectangle.getArea());

        input.close();
    }
}
