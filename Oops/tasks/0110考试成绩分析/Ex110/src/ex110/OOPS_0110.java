package ex110;
import java.util.Scanner;

public class OOPS_0110 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ScoreData score = new ScoreData();

        //输入班级数
        int classNum = input.nextInt();
        score.setClassNum(classNum);

        //输入学生成绩
        score.inputData();

        //输出结果
        score.printResult();

        input.close();
    }
}
