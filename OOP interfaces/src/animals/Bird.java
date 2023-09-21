package animals;

public class Bird extends Animal implements AbleToFly, AbleToRun {
    @Override
    public void eat() {
        System.out.println("i eat bread");
    }

    @Override
    public void fly() {
        System.out.println("bird flies");
    }

    @Override
    public void run() {
        System.out.println("bird runs");
    }
}
