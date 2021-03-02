//satic variable - Q. Static Block
import java.io.*;
import java.lang.*;


class staticdemo{
	static int x;    //first 1 -variables
	static int y=20; //first 2 - variables
	static void disp(int a){ //will be executed only if they are called 
		System.out.println("Y is "+y);
		System.out.println("A is "+a);
	}
	
	static{ //second before main is executed the compiler check whether there is any static blocks
		System.out.println("SIB is running");
		x=y*20;
		System.out.println("X is "+x);
		
	}
	public static void main(String arge[]){
		System.out.println("In main Block");
		disp(10);
	}
}