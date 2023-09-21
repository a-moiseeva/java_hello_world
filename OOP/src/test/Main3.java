package test;
import example.Employee;

public class Main3 {
    public static void main(String[] args) {
        String [] employees = getEmployees();
        for (String employee : employees){
            System.out.println(employee);
        }


        String [] newArray = new String[employees.length+1];
        for (int x=0; x<employees.length;x++){
            newArray[x]=employees[x];
        }
        newArray[employees.length]="Ruth";
        employees=newArray;

        for (String employee : employees){
            System.out.print(employee);
        }



    }
    private static String[] getEmployees(){
        String[] employees = new String[3];
        employees[0]="John";
        employees[1]="Alice";
        employees[2]="Bob";
        return employees;
    }


}
