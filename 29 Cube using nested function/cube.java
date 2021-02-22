//Q.Find the cube  of a number using  nested function


import java.io.*;

class Test
{
	public int cube(int n)
	{
		int c=n*sqr(n);
		return(c);
	}
	private int sqr(int n)
	{
		int s=n*n;
		return(s);
	}
}

public class cube
{
	public static void main(String args[])
	{
		Test t=new Test();
		int s=t.cube(5); //argument pass
		System.out.println(s);
	}
}
