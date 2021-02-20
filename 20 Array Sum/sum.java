//Q. Find the sum of elements of array using advanced for loop

import java.io.*;

class sum
{
	public static void main(String args[])
	{	
		int a[]={23,1,0,-56,35}; //Declare an array
		int sum=0;
		for(int i:a) //To print the array
			sum=sum+i;
		System.out.println("Sum: "+sum);
	}
}	