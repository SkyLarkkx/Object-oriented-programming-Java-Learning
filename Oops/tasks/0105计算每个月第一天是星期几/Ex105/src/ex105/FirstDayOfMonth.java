package ex105;

//判断年份是否为闰年
public class FirstDayOfMonth {
    private static boolean isLeapYear(int year){
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            return true;
        }
        else return false;
    }


    public static void printAll(int year,int firstDayOfYear){
        //平年每月天数数组
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        //闰年时每月天数数组情况
        if(isLeapYear(year)){
            daysInMonth[1] = 29;
        }

        //依次输出每月第一天是星期几
        int currentDay=firstDayOfYear;
        for(int i = 0;i < 12;i++){
            System.out.print(currentDay);
            if(i!=11) System.out.print(" ");
            currentDay = (currentDay + daysInMonth[i]) % 7;
        }
    }
}
