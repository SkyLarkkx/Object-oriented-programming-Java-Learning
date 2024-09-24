package ex105;
import java.util.Scanner;

public class OOPS_0105 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();
        int firstDayOfYear = scanner.nextInt();

        // 检查输入是否正确
        if (year <= 0 || firstDayOfYear < 0 || firstDayOfYear > 6) {
            System.out.println("不正确的输入");
            return;
        }

        FirstDayOfMonth.printAll(year,firstDayOfYear);

        scanner.close();
    }
}
