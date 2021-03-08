class student{
    String name;
    int no;
    public void setName(String n){ name =n;}
    public void setNo(int num){no=num;}
    public String getName(){return name;}
    public int getNo(){return no;}
}

public class encapsulation{
    public static void main(String args[]){
        student s1= new student();
        s1.setName("Milan");
        s1.setNo(123);
        System.out.println("Student name is: "+s1.getName());
        System.out.println("Student number is: "+s1.getNo());
    }
}