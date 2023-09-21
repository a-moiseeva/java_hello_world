package workers;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Director director = new Director();
        Programmer programmer = new Programmer();
        Shef shef = new Shef();

//        ArrayList<Worker> workers=new ArrayList<>();
//        workers.add(programmer);
//        workers.add(shef);
//        for(Worker worker : workers){
//            worker.work();
//        }



        director.force(programmer);

        director.force(new Worker() {
            @Override
            public void work() {
                System.out.println("worker works!!!");
            }
        });



        WaiterJohn john= new WaiterJohn();
        Client client = new Client();
        client.makeOrder(john, "soup");


        Waiter bob = new Waiter() {
            @Override
            public void bringOrder(String dish) {
                System.out.println("Bob brought the "+dish);
            }
        };

        client.makeOrder(bob, "pizza");


        client.makeOrder(new Waiter() {
            @Override
            public void bringOrder(String dish) {
                System.out.println("Steve ate your "+dish+"!!");
            }
        }, "salad");


    }
}
