package ex107;

public class ValueOfe {
    public static double Get(double n){
        double e = 1;//定义e
        double fac = 1;//定义阶乘n-1项和
        for(int i = 1;i <= n;i++){
            fac *= i;
            e += 1/fac;
        }
        return e;
    }
}
