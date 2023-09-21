package example;

public class Rect {
    int a;
    int b;

    public void setDimensions(int a,int b){
        this.a=a;
        this.b=b;
    }

    public int getSquare(){
        return a*b;
    }
    public void showSquare(){
        System.out.println("square is: "+getSquare());
    }



}
