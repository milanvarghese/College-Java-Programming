//Passing objects as parameter
import java.io.*;
import java.lang.*;

class dist{
	int ft, in;
	dist(){
		System.out.println("This program is about distances");
	}
	dist add(dist d){
		dist dn=new dist();
		dn.ft=d.ft+this.ft; //this will work
		dn.in=d.in+this.in;
	return dn;
	}
	void getdata(){
		try{
			DataInputStream dis= new DataInputStream(System.in);
			System.out.println("Enter Feet: ");
			ft=Integer.parseInt(dis.readLine());
			System.out.println("Enter Inch: ");
			in=Integer.parseInt(dis.readLine());
			while(in>=12){   //for conversion 12 in = 1 feet
				if(in>=12){
					ft=ft+1;
					in=in-12;
				}
			}
		}catch(Exception e){
		
		}
	}
	void putdata(){
		System.out.println("The distance is "+ft+" feet and "+in+" Inches ");
	}
}

public class distance{
	public static void main(String args[]){
		dist d1= new dist();
		d1.getdata();d1.putdata();
		dist d2= new dist();
		d2.getdata();d2.putdata();
		dist d3= new dist();
		d3=d1.add(d2); //object as parameter
		d3.putdata();
	}
}