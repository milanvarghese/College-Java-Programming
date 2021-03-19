//Throw an exception whenever age is less than 18

class throwe{
    public static void checkage(int age){
        if(age<18){
            throw new ArithmeticException ("You should be above 18! ");
        }else{
            System.out.println("You are eligible");
        }
    }

    public static void main(String args[]){
        try{
            checkage(12);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}