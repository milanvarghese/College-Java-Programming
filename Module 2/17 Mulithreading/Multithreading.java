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

class ThreadB extends Thread{
    String tname;
    ThreadB(String str){
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
class ThreadC extends Thread{
    String tname;
    ThreadC(String str){
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

class Multithreading{
    public static void main(String args[]) {
        ThreadA t1= new ThreadA("First Thread!");
        t1.start(); 
        ThreadB t2= new ThreadB("Second Thread!");
        t2.start(); 
        ThreadC t3= new ThreadC("Third Thread!");
        t3.start();   
    }
}