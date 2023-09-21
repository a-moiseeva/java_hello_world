package example;

public class Math {

    public static final double PI = 3.14;

    public static int sum(int... numbers){
        int sum =0;
        for (int number: numbers){
            sum+=number;
        }
        return sum;
    }

    public static double length(double radius){
        return 2* PI *radius;
    }
    public static double area(double radius){

        return PI *radius*radius;
    }

    public static int multiply(int a, int b){
        return a*b;
    }

    public static double multiply(double a, double b){
        return a*b;
    }
    public static int multiply(int a){
        return multiply(a,a);
    }
}
