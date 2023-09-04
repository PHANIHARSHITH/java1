
public class DemoPrimeV3 {
    public static void main(String args[]) {
        int i,num,flag=0;
        num=Integer.parseInt(args[0]);
           for ( i =2;i<= num/2;i++)
        {
            if(num%i==0)
            {
                System.out.println(num +" is not a primenumber");
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println(num+" is a primenumber");
        }
    }
}
 
