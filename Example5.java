import java.util.Scanner;
class Example5{
    
    public static void main(String args[]){
        
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter project score, external score and internal score");
        
        int project=s.nextInt();
        int external=s.nextInt();
        int internal=s.nextInt();
        int total=0;
        
        
        if(project>=50 && external>=50 && internal>=50){
            
            total=(project*70)/100 + (external*20)/100+ (internal*10)/100;
            System.out.println("Total score: "+total);
            
            if(total>=90){
                System.out.println("A grade");
            }
            else if(total>=75){
                System.out.println("B grade");
            }
            else{
                System.out.println("C grade");
            }
            
        }
        else{
            if(project<50){
                 System.out.println("You got failed in project and score is: "+project);
            }
            if(external<50){
                 System.out.println("You got failed in External and score is: "+external);
            }
            if(internal<50){
                 System.out.println("You got failed in internal and score is: "+internal);
            }
            
        }
        
    }
}