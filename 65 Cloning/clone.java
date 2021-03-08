import java.lang.*;
class demo{
    public int a,b;
    public Object clone(){
        try{
            return super.clone();
        }catch(CloneNotSupportedException e){
            return this;
        }
    }
}
public class clone{
    public static void main(String args[]) throws CloneNotSupportedException{
        demo d1 = new demo();
        d1.a=10;
        d1.b=20;
        
        demo d2=(demo) d1.clone();

        System.out.println("d1.a: "+d1.a+" d1.b: "+d1.b);
        System.out.println("d2.a: "+d2.a+" d2.b: "+d2.b);
    }
}