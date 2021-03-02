//Display the details of a student using method overriding.

class person{
	String name="Milan";
	int number=894;
	String address="Rajagiri";
	void disp(){
		System.out.println("Person Details are");
		System.out.println("Name: "+name);	
		System.out.println("Number: "+number);
		System.out.println("Address: "+address);
	}
}
class student extends person{
	int rollno=21;
	int finalmark=100;
	void disp(){
		System.out.println("Student Details are");
		System.out.println("Name: "+name);	
		System.out.println("Number: "+number);
		System.out.println("Address: "+address);
		System.out.println("rollno: "+rollno);
		System.out.println("finalmark: "+finalmark);
	}
}

public class studetails{
	public static void main(String args[]){
		student s= new student();
		s.disp();
	}
}