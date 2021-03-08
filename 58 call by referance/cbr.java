class cnum{
    public int n;
}
class cinc{
    public void inc(cnum cm){
        System.out.println("A (function - before inc): "+cm.n);
        cm.n++;
        System.out.println("A (function - after inc): "+cm.n);
    }
}
public class cbr{
    public static void main(String args[]){
        cnum cn = new cnum();
        cn.n=20;
        cinc c = new cinc();
        System.out.println("A (main - before fn call): "+cn.n);
        c.inc(cn);
        System.out.println("A (main - after fn call): "+cn.n);
    }
}