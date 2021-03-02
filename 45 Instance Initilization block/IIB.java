//Instance Initilization Block
import java.io.*;
import java.lang.*;


class IIB{
	IIB(){ //def
		System.out.println("Non-parametrised! ");	
	}
	IIB(int a){
		System.out.println("parametrised! ");	
	}
	//Instance Initilization Block
	{
		System.out.println("Inside my IIB");
	}
	public static void main(String args[]){
		new IIB(); //def 
		new IIB(10); //parameter
	}
}