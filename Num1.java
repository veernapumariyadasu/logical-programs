// Writ A Program to print n-1 numbers using for loop
import java.util.Scanner;
class Num1{
    
    public static void main(String args[]){
        
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter n value");    //10 9 8 7....1
        int n=s.nextInt();  
        
          int i=0;
          
          for(i=n;i>=1;i--){    
              System.out.print(i+" ");
          }                                         
        
       
    }
}