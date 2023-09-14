import java.io.*;
import java.util.*;
class Animal{
    public void animalSound(){
    System.out.println("Animals can make sounds");
    }
}
class Cow extends Animal{
    public void animalSound(){
        System.out.println("A cow sounds-Moo");
    }
} 
class Cat extends Animal{
    public void animalSound(){
        System.out.println("A cat sounds-Meow");
    }
}
public class PolymorphismDemo{
    public static void main(String args[]){
        Animal an = new Animal();
        Animal c=new Cow();
        Animal ca=new Cat();
        an.animalSound();
        c.animalSound();
        ca.animalSound();
    }
}
