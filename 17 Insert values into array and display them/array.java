//Q. Read an array of size n and display it

import java.io.*;

class array
{
	public static void main(String args[])
	{	
		int n;
		int i;
		int arr[]; //Declare an array
		String str;
		try
		{
			DataInputStream dis=new DataInputStream(System.in);
			System.out.println("Enter size n: ");
			str=dis.readLine();
			n=Integer.parseInt(str);
			
			arr=new int[n];
			
			for(i=0;i<n;i++) //To read the array
			{
				System.out.println("Enter array element "+(i+1)+": ");
				str=dis.readLine();
				arr[i]=Integer.parseInt(str);
			}
			System.out.println("Array elements are: ");
			for(i=0;i<n;i++) //To print the array
			{
				System.out.println(arr[i]);
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}	