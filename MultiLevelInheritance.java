import java.io.*;
 class Animal {
    void eat() {
        System.out.println("Animal can eat");
    }
}
class Dog extends Animal {
    void bark(){
        System.out.println("Dog can bark");
    }
}
class  Puppy extends Dog {
    void weep(){
    System.out.println("Puppy Weeps");
    }
}
public class MultiLevelInheritance{
public static void main(String args[])
{
    Puppy pu=new Puppy();
    pu.eat();
    pu.bark();
    pu.weep();
    }  
}
