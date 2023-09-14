import java.io.*;
import java.util.*;
class Student{
    int rollnumber;//Instance variable
    String name;//Instance variable
    float fee;//Instance variable
    Student(int rollnumber,String name,float fee){
        this.rollnumber=rollnumber;
        this.name=name;
        this.fee=fee;
    }
    void display() {
        System.out.println("Student detail are : ");
        System.out.println("Registration number:"+rollnumber+","+"Name:"+name+","+"Hostel fee:"+fee);
    }
}
public class ThisDemo2
{
    public static void main(String args[]){
        Student s1=new Student(4245,"Phani Harshith",45700);
        Student s2=new Student(4228,"Manikanta",45700);
        s1.display();
        s2.display();
    }
}
