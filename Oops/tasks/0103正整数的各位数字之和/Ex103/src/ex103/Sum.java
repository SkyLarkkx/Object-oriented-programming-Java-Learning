package ex103;

public class Sum {
    public static int eachDigit(int num){
        //num - 输入的数
        int temp;//同余之后的数
        temp = num;
        int sum = 0;//数的各位数之和
        while(temp>0){
            sum += temp%10;
            temp /= 10;
        }
        return sum;
    }
}
