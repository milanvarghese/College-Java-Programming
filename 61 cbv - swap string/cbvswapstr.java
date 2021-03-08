class cswap{
    public void swap(String a, String b){
        System.out.println("A (function - before fn call): a= "+a+" b= "+b);
        String c;
        c=a;
        a=b;
        b=c;
        System.out.println("A (function - after fn call): a= "+a+" b= "+b);
    }
}
public class cbvswapstr{
    public static void main(String args[]){
        String a = "Hello";
        String b = "World";
        cswap c = new cswap();
        System.out.println("A (main - before fn call): a= "+a+" b= "+b);
        c.swap(a,b);
        System.out.println("A (main - after fn call): a= "+a+" b= "+b);
    }
}