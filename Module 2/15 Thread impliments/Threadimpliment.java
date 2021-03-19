import java.lang.Thread.*;

class ThreadA implements Runnable{
    String tname;
    ThreadA(String str){
        tname=str;
    }
    public void run(){
        System.out.println("Thread is running! "+tname);
        for(int i=1;i<5;i++){
            System.out.println(" "+tname+" "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                //TODO: handle exception
            }
        }
    }
}

class Threadimpliment{
    public static void main(String args[]) {
        ThreadA t1= new ThreadA("First Thread!");
        Thread m1= new Thread(t1);
        m1.start(); 

        ThreadA t2= new ThreadA("Second Thread!");
        Thread m2= new Thread(t2);
        m2.start(); 
    }
}