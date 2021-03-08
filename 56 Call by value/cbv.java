public class cbv{
    public static void inc(int b){
        System.out.println("A (function - before inc): "+b);
        b++;
        System.out.println("A (function - after inc): "+b);
    }
    public static void main(String args[]){
        int a = 20;
        System.out.println("A (main - before fn call): "+a);
        inc(a);
        System.out.println("A (main - after fn call): "+a);
    }
}