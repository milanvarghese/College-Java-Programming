//Q. Write a program to find the square of a number using a function
//passing no argument no return

class Test
{
	public void sqr()
	{
		int n=5;
		int s=n*n;
		System.out.println(s);	
	}
}

public class square  //yes argument no return 
{
	public static void main(String args[])
	{
		Test t=new Test();
		t.sqr(); //argument pass
	}
}
