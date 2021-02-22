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
		recu r=new recu();
		int s=r.fact(5); //argument pass
		System.out.println(s);
	}
}
