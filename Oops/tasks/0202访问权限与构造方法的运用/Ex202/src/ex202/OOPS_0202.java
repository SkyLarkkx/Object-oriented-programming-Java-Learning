package ex202;

import java.util.Scanner;

import ex202.shape.Rectangle;

public class OOPS_0202 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("输入矩形的长和宽（空格分隔）: ");
        Rectangle rect1 = new Rectangle(input.nextDouble(),input.nextDouble());
        System.out.printf("周长:%.2f,面积:%.2f\n",rect1.getPerimeter(),rect1.getArea());

        Rectangle rect2 = new Rectangle();
        System.out.print("输入矩形的长和宽（空格分隔）: ");
        rect2.setWidth(input.nextDouble());
        rect2.setHeight(input.nextDouble());
        System.out.printf("周长:%.2f,面积:%.2f\n",rect2.getPerimeter(),rect2.getArea());

    }
}
