package animals;

public class Cat extends Animal implements AbleToRun {
    @Override
    public void eat() {
        System.out.println("i eat whiskas");
    }

    @Override
    public void run() {
        System.out.println("cat runs");
    }
}
