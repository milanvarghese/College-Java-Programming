class finale{
    public static void main(String args[]){
        try{
            int a[]=new int[5];
            a[10]=50;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }finally{
            System.out.println("Print Finally");
        }
    }
}