class Exe1 extends Thread {
    
    public void run(){
        for(int i=0;i<=25;i++){
            System.out.println("User thread");
        }
    }
    public static void main(String args[]){
        
        Exe1 obj=new Exe1();
                  obj.start();
        
        for(int i=0;i<=15;i++){
            System.out.println("Main thread");
        }
        
        
    }
}