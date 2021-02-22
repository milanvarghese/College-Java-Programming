//Q.Using recursive function find the factorial of a number


import java.io.*;

class recu
{
	public int fact(int n)
	{
		if(n>=1) return n*fact(n-1);
		else return 1;
	}
}

public class recursivefun
{
	public static void main(String args[])
	{
		try
		{
			DataInputStream dis = new DataInputStream(System.in);
			System.out.println("Enter a number: ");
			int x=Integer.parseInt(dis.readLine());
			recu r=new recu();
			int s=r.fact(x); //argument pass
			System.out.println(s);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
