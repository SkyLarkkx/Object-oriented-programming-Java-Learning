package ex104;
import java.lang.Math;

public class GetArea {
    public static class triangle{
        public static double byVertexCoordinate(double x1,double y1,double x2,double y2,double x3,double y3){
            //通过顶点坐标求三角形面积

            //求三角形的三条边
            double s1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
            double s2 = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
            double s3 = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));

            //海伦公式求面积
            double s = ( s1 + s2 + s3 ) / 2; //求半周长
            double area = Math.pow( s*(s-s1)*(s-s2)*(s-s3),0.5);//求面积

            return area;//返回面积值
        }
    }
}
