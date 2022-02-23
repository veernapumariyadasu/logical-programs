/*WAP to read int,float,double,string values from user and print all the values on the o/p screen */

import java.util.Scanner;
class Primitive{
    
    public static void main(String args[]){
        
        int a=0;
        float b=0;
        double c=0.0;
        String str=null;
        
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter int value");
        a=s.nextInt();
        
        System.out.println("Enter float value");
        b=s.nextFloat();        
        
        System.out.println("Enter Double value");
        c=s.nextDouble();
               System.out.println("Int value is : "+a);
                System.out.println("float value is : "+b);
                System.out.println("double value is : "+c);
        
        System.out.println("Enter String value");
        str=s.next();
        System.out.println();
        
 
       
        System.out.println("String value is : "+str);
    }
}