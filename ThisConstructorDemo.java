import java.io.*;
import java.util.*;
class A{
    A(){
        System.out.println("Inside default constructor");
    }
    A(int x)
    {
        this();
        System.out.println("Paramterised constructor Invoked");
        System.out.println("X value is "+x);
    }
}
public class ThisConstructorDemo{
    public static void main(String args[]){
        A a =new A(4245);
    }
}
