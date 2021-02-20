//Q. Display n numbers

import java.io.*;

class array
{
	public static void main(String args[])
	{	
		int arr[]; //Declare an array
		try
		{
			DataInputStream dis=new DataInputStream(System.in);
			System.out.println("Enter size n: ");
			int n=Integer.parseInt(dis.readLine());
			
			System.out.println("Numbers are: ");
			for(int i=1;i<=n;i++) //To print the array
			{
				System.out.println((i));
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}	