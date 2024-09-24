package ex202.shape;


public class Rectangle{
    private double width;
    private double height;

    //有参构造方法
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    //无参构造方法
    public Rectangle() {
        this.width = 1.0;
        this.height= 1.0;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    //返回矩形周长
    public double getPerimeter() {
        return 2 * (width + height);
    }

    //返回矩形面积
    public double getArea() {
        return width * height;
    }
}
