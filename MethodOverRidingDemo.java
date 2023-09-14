import java.io.*;
import java.util.*;
class Bank{
    double getRateOfIntrest()
    {
        return 0;
    }
}
class SBI extends Bank{
    double getRateOfIntrest(){
        return 3.5;
    }
}
class HDFC extends Bank{
    double getRateOfIntrest(){
        return 4.5;
    }
}
class UnionBank extends Bank
{
    double getRateOfIntrest(){
        return 4.3;
    }
}
public class MethodOverRidingDemo{
    public static void main(String args[]){
        SBI s= new SBI();
        SBI s1=new SBI();
        HDFC h = new HDFC();
        UnionBank u = new UnionBank();
        System.out.println("SBI Rate Of Intrest is "+s.getRateOfIntrest());
        System.out.println("HDFC Rate Of Intrest is "+h.getRateOfIntrest());
        System.out.println("UnionBank Rate Of Intrest is "+u.getRateOfIntrest());
         System.out.println("SBI1 Rate Of Intrest is "+s1.getRateOfIntrest());


    }
}
