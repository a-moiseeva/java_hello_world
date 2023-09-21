package animals;

public class Dog extends Animal implements AbleToRun {
    @Override
    public void eat() {
        System.out.println("i eat pedigree");
    }

    @Override
    public void run(){
        System.out.println("dog runs");
    }
}