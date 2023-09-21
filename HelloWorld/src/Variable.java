public class Variable {
    public static void main(String[] args) {
        int days=366;
        int years=days/365;
        int months=days%365/30;
        days=days%365%30;
        System.out.println(years);
        System.out.println(months);
        System.out.println(days);

    }
}
