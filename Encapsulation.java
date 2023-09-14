import java.io.*;
import java.util.*;
 class Student{
    public String Sname;
    private String Sphone;
    public String getSphone(){
        return Sphone;
    }
    public void setSphone(String ph)
    {
        this.Sphone=ph;
    }
}
public class Encapsulation {
    public static void main(String args[])
    {
        Student s = new Student();
        s.Sname="Phani Harshith";
        s.setSphone("84XXXXXXXX");
        System.out.println("Student name is "+s.Sname);
        System.out.println("Student PhoneNumber is "+s.getSphone());
    }
}
