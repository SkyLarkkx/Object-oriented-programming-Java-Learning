package ex110;
import java.util.Scanner;
public class ScoreData {
    double[][] score;

    //设置成绩数组的行数 - 即该专业班数
    public void setClassNum(int num){
        //定义成绩数组
       score = new double[num][];
    }

    //输入各班成绩数据
    public  void inputData(){
        Scanner scanner = new Scanner(System.in);
        for(int i = 0;i < score.length;i++){
            int stuNum = scanner.nextInt();
            score[i] = new double[stuNum];
            for(int j = 0;j < stuNum;j++){
                score[i][j] = scanner.nextDouble();
            }
       }
    }

    //输出平均值
    public  void printMean(int row)
    {
        double sum = 0;//总成绩
        double mean;//平均值
        for(int i = 0;i < score[row].length;i++){
            sum += score[row][i];

        }
        mean = sum / score[row].length;
        System.out.printf("%.2f",mean);
    }

    //输出最大值
    public  void printMax(int row)
    {
        double max = score[row][0];//总成绩
        for(int i = 0;i < score[row].length;i++){
            if(score[row][i] > max){
                max = score[row][i];
            }
        }
        System.out.printf("%.2f",max);
    }

    //输出最小值
    public  void printMin(int row)
    {
        double min = score[row][0];//总成绩
        for(int i = 0;i < score[row].length;i++){
            if(score[row][i] < min){
                min = score[row][i];
            }
        }
        System.out.printf("%.2f",min);
    }

    //输出数据分析要求结果
    public  void printResult(){
        for(int i = 0;i < score.length;i++){
            printMean(i);
            System.out.print(" ");
            printMax(i);
            System.out.print(" ");
            printMin(i);
            System.out.print("\n");
        }
    }

}
