//Q. Read an array of size n and display it

import java.io.*;

class array
{
	public static void main(String args[])
	{	
		int m,n;
		int i,j;
		int arr[][]; //Declare an array
		String str;
		try
		{
			DataInputStream dis=new DataInputStream(System.in);
			System.out.println("Enter size m: ");
			str=dis.readLine();
			m=Integer.parseInt(str);
			System.out.println("Enter size n: ");
			n=Integer.parseInt(dis.readLine());
			arr=new int[m][n];
			
			for(i=0;i<m;i++) //To read the array
			{
				for(j=0;j<n;j++)
				{
					System.out.println("Enter array element "+(i+1)+": ");
					str=dis.readLine();
					arr[i][j]=Integer.parseInt(str);
				}
			}
			System.out.println("Array elements are: ");
			for(i=0;i<m;i++) //To print the array
			{
				for(j=0;j<n;j++)
				{
					System.out.println(arr[i][j]);
				}
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}	