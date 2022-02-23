// WAP to read int,float,double,string values from user and print all the values on the o/p screen 

import java.util.Scanner;
class Example4{
    
    public static void main(String args[]){
        
       int a=100,b=56,c=90;
       String str="bitLabs";
       
       System.out.println(a+b+c+str);  // 246bitLabs    100+56 ==>156+90 =146+bitLabs
       System.out.println(b+c+str+a);  // 146bitLabs100  146bitLabs100
       System.out.println(c+str+a+b);  // 90bitLabs156   90bitLabs10056
       System.out.println(str+a+b+c);  // bitLabs246     bitLabs1005690

       
    }
}
 