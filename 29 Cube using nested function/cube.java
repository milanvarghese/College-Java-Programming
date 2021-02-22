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
		try
		{
			DataInputStream dis = new DataInputStream(System.in);
			System.out.println("Enter a number: ");
			int x=Integer.parseInt(dis.readLine());
			Test t=new Test();
			int s=t.cube(x); //argument pass
			System.out.println(s);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
