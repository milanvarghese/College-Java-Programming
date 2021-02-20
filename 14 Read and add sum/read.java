//Q.Display the arguments in command line?

import java.io.*;
import java.lang.*;
public class read
{
	public static void main(String args[])
	{	
		int sum=0;
		int c=args.length;
		System.out.println("Number of arguments is "+c);
		for(int i=0;i<c;i++)
		{
			System.out.println("Arguments "+ (i+1) +" is "+args[i]);
			int x=Integer.parseInt(args[i]);
			sum=sum+x;
		}
		System.out.println("Sum "+ sum);
	}
}

