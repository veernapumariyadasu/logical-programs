//Write a Java program to find all factors of a number. 
public class Allfacters {
 
    public static void main(String[] args) {
        
        int num = 8;
         
        
        for(int i = 1; i <= num; ++i) {
            
            if(num % i == 0) {
                System.out.print(i+" ");
            }
        }
    }
}