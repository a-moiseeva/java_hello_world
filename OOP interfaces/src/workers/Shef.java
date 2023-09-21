package workers;

public class Shef implements Driver, Worker{
    @Override
    public void drive() {
        System.out.println("cook drives");
    }

    @Override
    public void work() {
        System.out.println("cook works");

    }
}
