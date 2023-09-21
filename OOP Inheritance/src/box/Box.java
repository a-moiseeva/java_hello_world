package box;

public class Box {
    public double length;
    public double width;
    public double heigh;
    public void showInfo(){
        System.out.print("l "+length+" w "+ width+" h "+heigh);
    }

    public Box(){
        this(1);
    }

    public Box(Box another){
        this(another.length, another.width,another.heigh);
    }


    public Box(double length, double width, double heigh) {
        this.length = length;
        this.width = width;
        this.heigh = heigh;
    }

    public Box(double size){
        this(size,size,size);
    }

    public void setDimensions(double length, double width, double heigh){
        this.length=length;
        this.heigh=heigh;
        this.width=width;
    }


    public String getStringVolume(){
        double volume = length*width*heigh;
        return "volume is " + volume + "!";
    }
    public double getVolume(){
        return length*width*heigh;
    };
    public void showVolume(){
        System.out.println("volume is: "+getVolume());
    }

    public void compare(Box another){
        if (getVolume()>another.getVolume()){
            System.out.println("current box is bigger");
        } else if (another.getVolume()>getVolume()){
            System.out.println("another box is bigger");
        } else{
            System.out.println("boxes are equal");
        }
    }

    public Box copy(){
        return new Box(length,width,heigh);
    }
    public Box increase(){
        return new Box(2*length,2*width,2*heigh);
    }


}
