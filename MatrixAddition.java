import java.io.*;
import java.util.*;
public class MatrixAddition {
    public static void main(String args[]){
        int arr[][];
        int r,c;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no.of rows : ");
         r= sc.nextInt();
        System.out.println("Enter the no.of coloums : ");
         c=sc.nextInt();
        int a[][]=new int[r][c];
        int b[][]=new int[r][c];
        int d[][]=new int[r][c];
        System.out.println("Total no.of elements in the matrix: "+(r*c));
        System.out.println("Enter "+(r*c)+" elements into matrix A :");
        for(int i=0;i<r; i++){
            for(int j=0;j<r;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter "+(r*c)+" elements into matrix B :");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                d[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("The resultant matrix is");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(d[i][j]+" ");
            }
            System.out.println();
        }
        }
}
