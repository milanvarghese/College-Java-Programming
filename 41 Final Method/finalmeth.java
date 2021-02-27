import java.io.*;
import java.lang.*;

class A{
	public void disp(){System.out.println("AAAAA");}
}

class B extends A{
	public void disp(){System.out.println("BBBBB");}
}

class finalmeth{
	public static void main(String arge[]){
		B b=new B();
		b.disp();
	}
}