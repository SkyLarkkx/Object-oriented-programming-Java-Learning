package ex109;

public class LockerProblem {
    public static void printOn(int num){
        int []Lockers =new int[num];
        //记录每个柜的开关次数
        for(int i = 1;i <= num;i++){
            for(int j = i;j <= num;j += i){
                Lockers[j-1] += 1;
            }
        }

        //遍历输出最后柜门是开的储物柜的编号
        for (int i = 0;i < Lockers.length; i++){
            if (Lockers[i] % 2 == 1){
                System.out.print(i+1 + " ");
            }
        }
    }
}
