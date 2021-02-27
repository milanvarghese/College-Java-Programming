import java.io.*;
import java.lang.*;

class lekshmi{
	int i=10;
	lekshmi(){System.out.println("Lekshmis class");}
	public void print(){System.out.println("Parent i is "+i);}
}

class anvita extends lekshmi{
	int i=20;
	anvita(){System.out.println("Anvita class");}
	public void print(){System.out.println("Child  i is "+super.i);} //parent function is overwritten
}

class supervar{
	public static void main(String arge[]){
	lekshmi l=new lekshmi();
	anvita a=new anvita();
	a.print();
	l.print();
	}
}