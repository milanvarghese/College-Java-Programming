class cswap{
    public void swap(int a, int b){
        System.out.println("A (function - before fn call): a= "+a+" b= "+b);
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println("A (function - after fn call): a= "+a+" b= "+b);
    }
}
public class cbvswapnum{
    public static void main(String args[]){
        int a = 20;
        int b = 40;
        cswap c = new cswap();
        System.out.println("A (main - before fn call): a= "+a+" b= "+b);
        c.swap(a,b);
        System.out.println("A (main - after fn call): a= "+a+" b= "+b);
    }
}