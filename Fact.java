//Writ A Program to print factors of a given number.


import java.util.Scanner;
class Fact{
    
    public static void main(String args[]){
        
        Scanner s=new Scanner(System.in);
         System.out.println("Enter n value");
         int n=s.nextInt();
         
         for(int i=1;i<=n/2;i++){      //100
             
             if(n%i==0){
                 System.out.print(i+" ");
             }
         }
    }
}