package ex101;
import java.util.Scanner;

public class OOPS_1011 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);//定义输入对象变量并创建对象
        double DC;//定义摄氏度
        DC=input.nextDouble();//输入摄氏度
        double DF;//定义华氏度
        DF=Translate.DCtranslateToDF(DC);//输入华氏度
        System.out.printf("%.2f",DF);//转换
        input.close();//关闭Scanner对象
    }

}
