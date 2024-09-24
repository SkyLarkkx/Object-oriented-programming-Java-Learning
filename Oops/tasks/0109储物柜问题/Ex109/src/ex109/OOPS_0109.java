package ex109;
import java.util.Scanner;

public class OOPS_0109 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        //输入储物柜数量
        int num = input.nextInt();

        //输出题目要求序号
        LockerProblem.printOn(num);

        input.close();
    }
}
