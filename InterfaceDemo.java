import java.io.*;
import java.util.*;
 interface Language {
  public  void getName(String Name);
}
class ProgrammingLanguage implements Language {
public void getName(String name){
    System.out.println("My favoururite programming language is "+name);
}
}
public class InterfaceDemo{
    public static void main(String args[]){
        ProgrammingLanguage pl = new ProgrammingLanguage();
        pl.getName("PYTHON");
    }
}
