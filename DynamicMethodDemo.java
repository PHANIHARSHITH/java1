import java.io.*;
 class A {
    void M1(){
        System.out.println("Inside A method M1");
    }
}
class B extends A {
    void M1(){
        System.out.println("Inside B method M1");
    }
}
public class DynamicMethodDemo{
    public static void main(String args[]){
        A a=new A();
        B b=new B();
       
        A r;
        r=a;
        r.M1();
        r=b;
        r.M1();
       
    }
}
