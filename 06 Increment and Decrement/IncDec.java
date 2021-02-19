//Q. If the sum is greater than 50 increment the sum else decrement the sum


public class IncDec
{
	public static void main(String args[])
	{	int x,y,z;
		x=20;
		y=30;
		z=x+y;
		System.out.println("Z= "+z);
		if(z>=50) z++;  //if(z>50) {z++;}
		else z--;
		System.out.println("Z= "+z);
	}
}