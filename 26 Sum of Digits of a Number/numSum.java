//Q. Find the sum of a number - YANR

import java.io.*;

class Test
{
	public void sum(int n)
	{
		int sum=0,temp=n;
		while(temp>0){
			sum=sum+temp%10;
			temp=temp/10;
		}
		System.out.println(sum);
	}
}

public class numSum
{
	public static void main(String args[])
	{	
		try
		{
			DataInputStream dis = new DataInputStream(System.in);
			System.out.println("Enter a number: ");
			int x=Integer.parseInt(dis.readLine());
			Test t=new Test();
			t.sum(x); //argument pass		
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
