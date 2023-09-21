package myCollection;

public class Main4 {
    public static void main(String[] args) {
        MyArrayList array = new MyArrayList();

        array.add("John");
        array.add("Mary");
        array.add("John");
        array.add("Mary");
        array.add("John");
        array.add("Mary");
        array.add("John");
        array.add("Mary");
        array.remove("Mary");

        System.out.println(array.getSize());
        System.out.println(array.get(3));




    }
}
