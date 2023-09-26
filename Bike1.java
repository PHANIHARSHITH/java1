import java.io.*;
public class Bike1 {
    final int speedlimit=80;
    void run(){
        speedlimit = 120;
    }
    public static void main(String args[]){
        Bike1 b =new Bike1();
        b.run();
    }
}
//This Program gives an error as variable speedlimit is final and can not be changed
