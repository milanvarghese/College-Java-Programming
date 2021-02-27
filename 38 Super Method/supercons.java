import java.io.*;
import java.lang.*;

class lekshmi{
	int i=10;
	lekshmi(){System.out.println("Parent Constructor");}
	public void print(){System.out.println("Parent i is "+i);}
}

class anvita extends lekshmi{
	int i=20;
	anvita(){
	super(); //we can call the parent constructor using the super() function
	System.out.println("Child Constructor");}
	public void print(){System.out.println("Child  i is "+super.i);} //parent function is overwritten
	
}

class supercons{
	public static void main(String arge[]){
	//lekshmi l=new lekshmi();
	anvita a=new anvita();
	a.print();
	}
}