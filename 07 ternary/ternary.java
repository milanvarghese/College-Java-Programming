//Q. If the sum is greater than 50 increment the sum else decrement the sum


public class ternary
{
	public static void main(String args[])
	{	int x,y,z;
		x=20;
		y=30;
		z=x+y;
		System.out.println("Z= "+z);
		z=(z>=50)?(z+10):(z-10);
		System.out.println("Z= "+z);
		
	}
}