package ex108;
import java.util.Scanner;

public class OOPS_0108 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //输入整数
        int num = input.nextInt();

        //对整数进行判断
        if(num < 0){
            System.out.print("不正确的输入");
        }else if(Palindrome.isPalindromeIntergers(num)){
            System.out.print(num + "是回文整数");
        }else{
            System.out.print(num + "不是回文整数");
        }

        input.close();
    }
}
