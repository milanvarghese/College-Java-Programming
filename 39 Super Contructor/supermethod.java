import java.io.*;
import java.lang.*;

class lekshmi{
	int i=10;
	
	public void print(){System.out.println("Parent i is "+i);}
}

class anvita extends lekshmi{
	int i=20;
	
	public void print(){
		System.out.println("Child  i is "+i);
		super.print();
	}
	
}

class supermethod{
	public static void main(String arge[]){
	lekshmi l=new lekshmi();
	anvita a=new anvita();
	a.print();
	}
}