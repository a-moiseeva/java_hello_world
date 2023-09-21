import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        int[] massive = new int[2];
        int a=0;
        try{
            massive[0]=1;
            massive[1]=2;
            int b = 7/0;
            massive[2]=3;
            massive[3]=4;
        } catch(ArrayIndexOutOfBoundsException e1){
            System.out.println("catch "+ e1.getClass());
        } catch (Exception e2){
            System.out.println(e2);
        }
    }
}
