package ex108;

public class Palindrome {
    public static boolean isPalindromeIntergers(int num){
        //将整数转换为字符串
        String string = String.valueOf(num);

        //遍历比较对应位数是否相同
        for(int i = 1;i < string.length()/2;i++){
            if(string.charAt(i) != string.charAt(string.length()-1-i))
                return false;
        }
        return true;
    }
}
