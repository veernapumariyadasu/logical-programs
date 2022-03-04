


class Exe3 extends Thread {
    
    public void run(){
        for(int i=0;i<=25;i++){
        	try {
        	Thread.sleep(2000);
        	}
        	catch(InterruptedException t) {
        		System.out.println(t);
        	}
            System.out.println("User thread");
        }
    }
    public static void main(String args[]){
        
        Exe3 obj=new Exe3();
                  obj.start();
        
        for(int i=0;i<=15;i++){
        	try {
            	Thread.sleep(1200);
            	}
            	catch(InterruptedException t) {
            		System.out.println(t);
            	}
            System.out.println("Main thread");
        }
        
        
    }
}