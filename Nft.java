
//Writ A Program to print number of factors for the given number.


  


import java.util.Scanner;
class Nft{
    
    public static void main(String args[]){
        
        Scanner s=new Scanner(System.in);
         System.out.println("Enter n value");
         int n=s.nextInt();
         int count=0;
         for(int i=1;i<=n/2;i++){      //100   1 2 3 4....50
             
             if(n%i==0){           // 1 2 4 5 10 20 25 50
                 count++;
             }
         }
         System.out.println("Number of factors: "+count);
    }
}