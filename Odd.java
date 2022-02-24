import java.util.Scanner;
class Odd{
    
    public static void main(String args[]){
        
        Scanner s=new Scanner(System.in);
         System.out.println("Enter n value");
         int n=s.nextInt();   // 50
         
         for(int i=1;i<=n;i++) {    //1 2 3 4 5 6 .....50  
             
             if(i%2!=0){
                 System.out.print(i+" ");
             }
         }
    }
}