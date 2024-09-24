package ex201;

public class Rectangle {
    double width;//矩形的官渡
    double height;//条形的高度

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getPerimeter() {
        //返回矩形的周长
        return 2 * (width + height);
    }

    public double getArea() {
        //返回矩形的面积
        return width * height;
    }

}
