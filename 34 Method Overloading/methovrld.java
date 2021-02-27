import java.io.*;
import java.lang.*;

class maxclass{
	int max(int a,int b)	{if(a>b) return a; else return b;}
	float max(float a,float b)	{if(a>b) return a; else return b;}
	int max(int a,int b,int c){
		int x= max(a,b); 
		int m=max(x,c);
		return m;
	}
}

class methovrld{
	public static void main(String args[]){
		maxclass m= new maxclass();
		int ix,iy,iz, im;
		float fx,fy,fm;
		try{
			DataInputStream dis= new DataInputStream(System.in);
			System.out.println("Enter int 1: ");ix=Integer.parseInt(dis.readLine());
			System.out.println("Enter int 2: ");iy=Integer.parseInt(dis.readLine());
			im=m.max(ix,iy);
			System.out.println("Max: "+im);
			System.out.println("Enter float 1: ");fx=Float.parseFloat(dis.readLine());
			System.out.println("Enter float 2: ");fy=Float.parseFloat(dis.readLine());
			fm=m.max(fx,fy);
			System.out.println("Max: "+im);
			System.out.println("Enter int 1: ");ix=Integer.parseInt(dis.readLine());
			System.out.println("Enter int 2: ");iy=Integer.parseInt(dis.readLine());
			System.out.println("Enter int 3: ");iz=Integer.parseInt(dis.readLine());
			im=m.max(ix,iy,iz);
			System.out.println("Max: "+im);
		}catch(Exception e){}
	}
}


