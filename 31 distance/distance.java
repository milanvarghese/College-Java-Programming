import java.io.*;
import java.lang.*;

class dist{
	int ft, in;
	dist(){
		System.out.println("This program is about distances");
	}
	void getdata(){
		try{
			DataInputStream dis= new DataInputStream(System.in);
			System.out.println("Enter Feet: ");
			ft=Integer.parseInt(dis.readLine());
			System.out.println("Enter Inch: ");
			in=Integer.parseInt(dis.readLine());
			
		}catch(Exception e){
		
		}
	}
	void putdata(){
		System.out.println("The distance is "+ft+" feet and "+in+" Inches ");
	}
}

public class distance{
	public static void main(String args[]){
		dist d= new dist();
		d.getdata();
		d.putdata();
	}
}