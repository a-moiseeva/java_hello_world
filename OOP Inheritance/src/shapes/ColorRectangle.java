package shapes;

public class ColorRectangle extends Rectangle {

    private String color;

    public ColorRectangle(int a, int b, String color) {
        super(a, b);
        this.color=color;
    }

    @Override
    public int getPerimeter() {
        return super.getPerimeter();
    }

    public String getColor() {
        return color;
    }
}
