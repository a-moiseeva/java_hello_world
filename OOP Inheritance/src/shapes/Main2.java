package shapes;

public class Main2 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(2,2,2);
        triangle.showPerimeter();


        Rectangle rectangle = new Rectangle(2,3);
        rectangle.showPerimeter();


        ColorRectangle colorRectangle = new ColorRectangle(1,1,"violet");
        colorRectangle.showPerimeter();
        System.out.println(colorRectangle.getColor());

    }



}
