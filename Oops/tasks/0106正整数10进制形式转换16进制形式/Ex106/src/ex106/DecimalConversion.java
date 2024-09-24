package ex106;

public class DecimalConversion {
    public static String toHexadecimal(int decimal) {
        if (decimal == 0) return "0";

        String hexDigits = "0123456789ABCDEF";
        StringBuilder hex = new StringBuilder();//构建StringBuilder类的对象
        while (decimal > 0) {
            int remainder = decimal % 16;
            hex.insert(0, hexDigits.charAt(remainder));  // 将对应的十六进制字符插入到字符串的前面
            decimal /= 16;  // 更新十进制数为原来的1/16
        }

        return hex.toString();//转化为String类的对象
    }
}
