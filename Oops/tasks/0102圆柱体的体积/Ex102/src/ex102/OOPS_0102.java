package ex102;
import java.util.Scanner;

public class OOPS_0102 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        //System.out.println("底面半径:");
        double bottomRadius=input.nextDouble();//输入圆柱体底面半径
        //System.out.println("高:");
        double height=input.nextDouble();//输入圆柱体的高
        //System.out.println("体积:");
        double volume=Cylinder.GetVolume(bottomRadius,height);//求体积
        System.out.printf("%.2f",volume);
        input.close();
    }
}
