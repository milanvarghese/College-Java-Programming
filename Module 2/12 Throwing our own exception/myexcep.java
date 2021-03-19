//Create our own exception where a/b is less than .5;
import java.io.*;
class MilansException extends Exception{
    MilansException(String message){
            super(message);
    }
}
public class myexcep{
    public static void main(String args[]) throws IOException{
        DataInputStream dis=new DataInputStream(System.in);
        float a,b,c;
        a=Float.parseFloat(dis.readLine());
        b=Float.parseFloat(dis.readLine());
        try{
            c=a/b;
            if(c<.5) throw new MilansException ("Less than .5");
        }catch(MilansException e){
            System.out.println(e);
        }
    }
}