package ex102;

//import java.util.Scanner;
import java.lang.Math;

public class Cylinder {
    public static double GetVolume(double radius,double height){
        //radius - bottom radius of the volume
        //height - height of the volume
        double volume;//体积
        volume=Math.PI*Math.pow(radius,2)*height;//求圆柱体体积
        return volume;
    }
}