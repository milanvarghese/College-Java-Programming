import java.io.*;

class ThreadA extends Thread{
    String tname;
    ThreadA(String str){
        tname=str;
    }
    public void run(){
        System.out.println("Thread is running! "+tname);
        for(int i=1;i<5;i++){
            System.out.println(" "+tname+" "+i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                //TODO: handle exception
            }
        }
    }
}

class Threadextends{
    public static void main(String args[]) {
        ThreadA t1= new ThreadA("First Thread!");
        t1.start(); 
        ThreadA t2= new ThreadA("Second Thread!");
        t2.start();   
    }
}