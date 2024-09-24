package ex107;
import java.util.Scanner;

public class OOPS_0107 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n = input.nextDouble();//输入项数n
        //检查输入
        if(n <= 0)
            System.out.print("不正确的输入");

        //求e
        double e = ValueOfe.Get(n);
        System.out.printf("%.8f",e);

        input.close();
    }
}
