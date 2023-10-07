import java.io.*;
 class Employee {
    float salary=40000;
}
public class Programmer extends Employee{
    int bouns=10000;
    public static void main(String[] args){
        Programmer p =new Programmer();
        System.out.println("Programmer Salary is "+p.salary);
        System.out.println("Programmer bouns is "+p.bouns);
        float Total_salary=p.salary+p.bouns;
        System.out.println("Total Salary is "+Total_salary);
        }
}
