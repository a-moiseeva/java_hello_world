public class DataTypes {
    public static void main(String[] args) {
        int speed = 300_000;
        long distance = 365*24*60*60*speed;
        System.out.println(distance);

        long distance1 = (long)(365*24*60*60*speed);
        System.out.println(distance1);

        long speed2=300_000;
        long distance2 = 365*24*60*60*speed2;
        System.out.println(distance2);



        byte b=127;
     //   b=b+1; -- тут число 1 - int, значит b+1 - инт, но b - byte!
        b=(byte)(b+1);
        b+=1;
        System.out.println(b);






    }
}
