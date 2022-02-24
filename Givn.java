
//Writ A Program to check given number is perfect numebr or nuber

import java.util.Scanner;
class Givn{
    
    public static void main(String args[]){
        
        Scanner s=new Scanner(System.in);
         System.out.println("Enter n value");
         int n=s.nextInt();
          int sum=0;
          
          for(int i=1;i<=n/2;i++){   // 6   1 2 3 
              if(n%i==0){
                 sum=sum+i;    //1+2 = 3+3=6
              }
          }
          if(sum==n){
              System.out.println("Perfect number");
          }
          else{
              System.out.println("Not a perfect number");
          }
    }
}