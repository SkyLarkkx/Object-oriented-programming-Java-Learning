package ex106;
import java.util.Scanner;

public class OOPS_0106 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        //检查输入
        if(num < 0){
            System.out.print("不正确的输入");
            return;
        }

        String hexResult = DecimalConversion.toHexadecimal(num);
        System.out.print(hexResult);

        input.close();
    }
}
