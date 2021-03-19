public class mcatch{
    public static void main(String args[]){
        try{
            int b=10/0;
            System.out.println("Array Element is? "+b);
            int a[]={10,20,30,40};
            System.out.println("Array Element is? "+a[10]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("First Catch Block!");
            System.out.println(e);
        }catch(ArithmeticException e){
            System.out.println("Second Catch Block!");
            System.out.println(e);
        }catch(NullPointerException e){
            System.out.println("Third Catch Block!");
            System.out.println(e);
        }catch(Exception e){
            System.out.println("Last Catch Block!");
            System.out.println(e);
        }
    }
}