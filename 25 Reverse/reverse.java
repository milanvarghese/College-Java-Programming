//Q. Find the reverse of a number - YAYR

import java.io.*;

class rev
{
	public int sqr(int n)
	{
		int rev=0;
		while(n>0){
			rev=rev*10+n%10;
			n=n/10;
		}
		return(rev);
	}
}

public class reverse
{
	public static void main(String args[])
	{	
		try
		{
			DataInputStream dis = new DataInputStream(System.in);
			System.out.println("Enter a number: ");
			int x=Integer.parseInt(dis.readLine());
			rev r=new rev();
			int re=r.sqr(x); //argument pass
			System.out.println("Reverse of "+12345+" is "+re);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}

		
	}
}
