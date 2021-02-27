import java.io.*;
import java.lang.*;

final class A{ //error will come
	final public void disp(){System.out.println("AAAAA");}
}

class B extends A{
	public void disp(){System.out.println("BBBBB");}
}

class finalclass{
	public static void main(String arge[]){
		B b=new B();
		b.disp();
	}
}