class cinc{
    public void inc(int b){
        System.out.println("A (function - before inc): "+b);
        b++;
        System.out.println("A (function - after inc): "+b);
    }
}
public class cbcl{
    public static void main(String args[]){
        int a = 20;
        cinc c = new cinc();
        System.out.println("A (main - before fn call): "+a);
        c.inc(a);
        System.out.println("A (main - after fn call): "+a);
    }
}