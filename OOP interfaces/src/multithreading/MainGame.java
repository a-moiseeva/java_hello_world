package multithreading;

import java.util.Random;

public class MainGame {
    static Random random = new Random();
    static int a = random.nextInt(10_000_000);

    static boolean isGuessed = false;



    public static void main(String[] args) {
        System.out.println(a);
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while(!isGuessed){
                    Random random = new Random();
                    int b = random.nextInt(10_0000_000);
                    if (a==b){
                        isGuessed=true;
                        System.out.println(b);
                    }

                }
            }
        });
        thread1.start();


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                int i =0;
                while (!isGuessed){
                    System.out.println(i);
                    try{
                        Thread.sleep(1000);
                    }catch(Exception e){
                    }
                    i++;
                }
            }
        });
        thread2.start();
    }

}
