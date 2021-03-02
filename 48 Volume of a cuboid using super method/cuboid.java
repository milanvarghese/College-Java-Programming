//Q. Calculate the volume of a cuboid

class rect{
	int l,b;
	rect(int x, int y){
		l=x;
		b=y;
	}
}

class cube extends rect{
	int h;
	cube(int x, int y, int z){
		super(x,y);
		h=z;
	}
	int vol(){
		return(l*b*h);
	}
}

class cuboid{
	public static void main(String args[]){
	cube c= new cube(2,4,6);
	System.out.println("The volume of the cuboid is: "+c.vol());
		
	}
}
