package catFamily;

import box.WeightBox;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Lion lion = new Lion();
        System.out.println(cat.isCanEatAPerson());
        System.out.println(lion.isCanEatAPerson());

        cat.eat();
        lion.eat();

        WeightBox weightBox=new WeightBox(10);
        weightBox.showInfo();

        WeightBox weightBox2=new WeightBox();
        weightBox2.showInfo();



    }
}
