package example;

public class Employee {
    String name;
    String position;
    double salary;


    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void showInfo(){
        System.out.println("worker "+name+" gets "+salary+" for "+position);
    }
}