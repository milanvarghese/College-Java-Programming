//Create an object clone of student

class student{
    String name;
    int no;
    public void setName(String n){ name =n;}
    public void setNo(int num){no=num;}
    public String getName(){return name;}
    public int getNo(){return no;}
    public Object clone(){
        try{
            return super.clone();
        }catch(CloneNotSupportedException e){
            return this;
        }
    }
}

public class clonestud {
    public static void main(String args[]) throws CloneNotSupportedException{
        student s1= new student();
        s1.setName("Milan");
        s1.setNo(123);
        System.out.println("Student name is: "+s1.getName());
        System.out.println("Student number is: "+s1.getNo());
        student s2= (student) s1.clone();
        System.out.println("Student name is: "+s2.getName());
        System.out.println("Student number is: "+s2.getNo());
    }
}