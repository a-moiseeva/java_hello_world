package test;

import java.sql.SQLOutput;

import box.Box;
import example.Employee;
import example.Rect;
import example.Test;
import example.Math;

import static example.Math.multiply;


public class Main {
    public static void main(String[] args) {



        Box box1 = new Box();
        box1.width=10;
        box1.length=10;
        box1.heigh=10;

        Box box2=box1;

        System.out.println(box1.getVolume());

        box2.showVolume();
        System.out.println(box2.getStringVolume());

        Test test = new Test();
        System.out.println(test.square(4));


        Box box3 = new Box();
        box3.setDimensions(10,20,30);
        box3.showVolume();


        Rect rect1 = new Rect();
        rect1.showSquare();
        rect1.setDimensions(5,7);
        rect1.showSquare();


        Box box5 = new Box();
        box5.showVolume();

        Employee employee1 = new Employee("John", "artist",1050);
        employee1.showInfo();


        Math math1 = new Math();
        System.out.println(multiply(6,7));
        System.out.println(multiply(7.8,7.5));
        System.out.println(multiply(8));

        System.out.println(multiply(2));
        System.out.println(java.lang.Math.sqrt(9));


        Box current = new Box();
        current.showVolume();

        Box another = new Box(2);
        another.showVolume();

        current.compare(another );

        Box anotherNew= new Box(another);
        anotherNew.showVolume();

        Box box6 = anotherNew.copy();
        box6.showVolume();

        Box box7 = box6.increase();
        box7.showVolume();

    }
}
