package workers;

public class Programmer implements Worker, Driver{
    @Override
    public void work() {
        System.out.println("programmer works");
    }

    @Override
    public void drive() {
        System.out.println("programmer drives");
    }
}
