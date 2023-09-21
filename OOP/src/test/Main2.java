package test;

import example.Employee;
import example.Person;
import example.Math;

public class Main2 {
    public static void main(String[] args) {

        Person john = new Person("John", 20);
        john.setAge(-40);

        System.out.println("Name: "+ john.getName()+ ", age: "+ john.getAge());

        System.out.println(Math.length(10));
        System.out.println(Math.PI);

        System.out.println(Math.sum(10,5,7));




        Employee[] employees = new Employee[3];
        employees[0]=new Employee("John","boss",100);
        employees[1]=new Employee("Bob","cook",50);
        employees[2]=new Employee("Sam","driver",50);

        for(Employee employee: employees){
            employee.showInfo();
        }





    }
}
