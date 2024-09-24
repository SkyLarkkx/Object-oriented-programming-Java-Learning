package ex104;
import java.util.Scanner;

public class OOPS_0104 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //输入坐标
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        //求面积
        double area=GetArea.triangle.byVertexCoordinate(x1,y1,x2,y2,x3,y3);

        //输出面积
        System.out.print("area=");
        System.out.printf("%.2f",area);

        input.close();
    }
}
