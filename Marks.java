/*WAP to check given marks are valid or not.  0-100*/
import java.util.Scanner;
class Marks{
    
    public static void main(String args[]){
        
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter marks");
        int marks=s.nextInt();
        
        if(marks>=0 && marks<=100){
            System.out.println("Valid marks");
        }
        else{
            System.out.println("Invalid marks");
        }
    
    }
}
 