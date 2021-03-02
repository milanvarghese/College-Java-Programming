//satic variable - Q. Show the usage of static variable?
import java.io.*;
import java.lang.*;

class test{
	static int x=10;
	static int y=20;
	static void disp(){
		System.out.println("X is "+x);
	}
}

class staticdemo{
	public static void main(String arge[]){
		System.out.println("In main Block");
		test.disp();
		System.out.println("In main x is "+test.x);
		System.out.println("In main y is "+test.y);
	}
}