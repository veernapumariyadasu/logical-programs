// Writ A Program to print 1-n numbers using for loop
import java.util.Scanner;
class Num2{
    
    public static void main(String args[]){
        
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter n value");
        int n=s.nextInt();  //50
        
          int i=0;
          
          for(i=1;i<=n;i++){     // i=0 , 1 2
              
              System.out.print(i+" ");
          }                                        // hi hi hi 
        
       
    }
}