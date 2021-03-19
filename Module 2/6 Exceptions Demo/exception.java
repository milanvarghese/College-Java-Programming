class exception{
    public static void main(String args[]){
        try{
            int a =50/0;
            System.out.println("A= "+a);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        try{
            String s=null;
            System.out.println("string size= "+s.length());
        }catch(NullPointerException e){
            System.out.println(e);
        }
        try{
            int a[]=new int[5];
            a[10]=50;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        try{
            String s1="abc";
            int i=Integer.parseInt(s1);
        }catch(NumberFormatException e){
            System.out.println(e);
        }
    }
}