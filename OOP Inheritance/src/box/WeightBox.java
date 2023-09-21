package box;

public class WeightBox extends Box {
    public double weight;

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.print(" w "+weight);
    }

    public WeightBox() {
        super();
        this.weight=1;
    }

    public WeightBox(Box another) {
        super(another);
        this.weight=another.width;
    }

    public WeightBox(double size) {
     //   this(size,size,size,size);
        super(size);
        this.weight=size;
    }

    public WeightBox(double length, double width, double heigh, double weight) {
        super(length, width, heigh);
        this.weight=weight;
    }
}
