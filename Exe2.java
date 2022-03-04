class Exe2 implements Runnable{
    
    public void run(){
        for(int i=1;i<=15;i++) {
        	System.out.println("User Thread");
        }
    }
    
    public static void main(String args[]){
        
    	Exe2 obj=new Exe2();
          Thread t=new Thread(obj);	
          t.start();
          
    	for(int i=1;i<=20;i++) {
        	System.out.println("main Thread");
        }
             
    }
}