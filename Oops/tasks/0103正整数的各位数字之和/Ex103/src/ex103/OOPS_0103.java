package ex103;
import java.util.Scanner;

public class OOPS_0103 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = Sum.eachDigit(num);
        System.out.print(sum);
        input.close();
    }
}
