package workers;

public class WaiterJohn implements Waiter{
    @Override
    public void bringOrder(String dish) {
        System.out.println("John brought the "+dish);
    }
}
