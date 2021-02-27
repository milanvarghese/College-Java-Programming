import java.io.*;
import java.lang.*;

class lekshmi{
	lekshmi(){System.out.println("Lekshmis class");}
	public void scolds(){System.out.println("Lekshmi scolds");}
}

class anvita extends lekshmi{
	anvita(){System.out.println("Anvita class");}
	public void scolds(){System.out.println("anvita scolds");} //parent function is overwritten
}

class inherdemo{
	public static void main(String arge[]){
	//lekshmi l=new lekshmi();
	anvita a=new anvita();
	a.scolds();
	}
}