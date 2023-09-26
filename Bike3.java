import java.io.*;
  public final class Bike3 {
     void run(){
        System.out.println("Bike is runnning");
    }
}
class Honda extends Bike2 {
    void run(){
        System.out.println("Honda runs at 120 kmph");
    }
   public static void main(String args[]){
        Honda h = new Honda();
        h.run();
    }
}
//This Program gives error as the method run() is declared as final and can not be overrided
