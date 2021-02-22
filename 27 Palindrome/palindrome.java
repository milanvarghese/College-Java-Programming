//Q. Check Weather a number is palindrome - NANR

import java.io.*;

class Test
{
	private int reverse(int n)
	{
		int rev=0;
		while(n>0){
			rev=rev*10+n%10;
			n=n/10;
		}
		return(rev);
	}

	public void pali()
	{	
		
		try
		{
			DataInputStream dis = new DataInputStream(System.in);
			System.out.println("Enter a number: ");
			int x=Integer.parseInt(dis.readLine());
			int r=reverse(x);		
			if(x==r) System.out.println("The number is palindrome!");
			else System.out.println("The number is not palindrome!");		
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}

public class palindrome
{
	public static void main(String args[])
	{
		Test t=new Test();
		t.pali();
	}
}
