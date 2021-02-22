//Q. Product of the digits - NAYR


import java.io.*;

class Test
{
	public int prod()
	{	
		int p=1;
		try
		{
			DataInputStream dis = new DataInputStream(System.in);
			System.out.println("Enter a number: ");
			int x=Integer.parseInt(dis.readLine());
			int temp=x;
			while(temp>0){
				p=p*temp%10;
				temp=temp/10;
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		return(p);
	}
}

public class product
{
	public static void main(String args[])
	{
		Test t=new Test();
		int p=t.prod();
		System.out.println(p);
	}
}
