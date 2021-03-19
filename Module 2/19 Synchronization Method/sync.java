//Sync

class First{
    synchronized public void display(String m){
        System.out.print("[");
        System.out.print(m);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            //TODO: handle exception
        }
        System.out.print("]");
        System.out.println("");
    }
}

class Second extends Thread{
    First ff;
    String ss;
    Second(First fo, String str){
        ff=fo;
        ss=str;
    }
    public void run(){
        ff.display(ss);
    }
}

public class sync{
    public static void main(String args[]) {
        First f = new First();
        Second ts1 = new Second(f, "Ding"); ts1.start();
        Second ts2 = new Second(f, "Dong"); ts2.start();
        Second ts3 = new Second(f, "Bell"); ts3.start();
    }
}