class cnum{
    public int a,b,c;
}
class cswap{
    public void swap(cnum x){
        System.out.println("A (function - before fn call): a= "+x.a+" b= "+x.b);
        x.c=x.a;
        x.a=x.b;
        x.b=x.c;
        System.out.println("A (function - after fn call): a= "+x.a+" b= "+x.b);
    }
}
public class cbrswapnum{
    public static void main(String args[]){
        cnum cn = new cnum();
        cn.a = 20;
        cn.b = 40;
        cswap c = new cswap();
        System.out.println("A (main - before fn call): a= "+cn.a+" b= "+cn.b);
        c.swap(cn);
        System.out.println("A (main - after fn call): a= "+cn.a+" b= "+cn.b);
    }
}