package multithreading;

public class Main3 {
    static boolean  isFive = false;
    public static void main(String[] args) {



//        Timer timer = new Timer();
//        Thread thread = new Thread(timer);
//        thread.start();


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < 10_000_000; i++) {
                    if(i==5){
                        isFive=true;
                    }
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e){

                    }
                }
            }
        });
        thread.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10_000_000; i++) {
                    if (isFive){
                        break;
                    }
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e){

                    }
                }
            }
        });
        thread2.start();



    }

}


