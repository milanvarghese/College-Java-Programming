class cstr{
    public String a,b,c;
}
class cswap{
    public void swap(cstr x){
        System.out.println("A (function - before fn call): a= "+x.a+" b= "+x.b);
        x.c=x.a;
        x.a=x.b;
        x.b=x.c;
        System.out.println("A (function - after fn call): a= "+x.a+" b= "+x.b);
    }
}
public class cbrswapstr{
    public static void main(String args[]){
        cstr cs = new cstr();
        cs.a = "Hello";
        cs.b = "World";
        cswap c = new cswap();
        System.out.println("A (main - before fn call): a= "+cs.a+" b= "+cs.b);
        c.swap(cs);
        System.out.println("A (main - after fn call): a= "+cs.a+" b= "+cs.b);
    }
}