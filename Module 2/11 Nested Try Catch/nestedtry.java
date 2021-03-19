public class nestedtry{
    public static void main(String args[]){
        try{//First Try

            try{//Second Try
                int i=12/0;
                System.out.println("I is "+i);
                try{//Third Try

                }catch(ArrayIndexOutOfBoundsException e){//Third Catch
                    System.out.println("Thrid Catch Block: ");
                    System.out.println(e);
                }
            }catch(ArithmeticException e){//Second Catch
                System.out.println("Second Catch Block: ");
                System.out.println(e);
            }
        }catch(Exception e){
            System.out.println("First Catch Block: ");
            System.out.println(e);
        }
    }
}