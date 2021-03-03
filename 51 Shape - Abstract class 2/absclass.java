abstract class shape{
	int l,r,b,h;
	shape(int x, int y){
		l=x;
		b=y;	 
	}
	shape(int x){
		r=x;	 
	}
	shape(int x,int y, int z){
		l=x;
		b=y;
		h=z;	 
	}
	public void display(){
		System.out.println("Shapeee");
	}
	abstract double area();
}

class rect extends shape{
	rect(int x,int y){
		super(x,y);
	}
	public void display(){
		System.out.println("Rectangle");
	}
	double area() {return(l*b);}
}


class circle extends shape{
	circle(int x){
		super(x);
	}
	public void display(){
		System.out.println("Triangle");
	}
	double area() {return(3.14*r*r);}
}

class triangle extends shape{
	triangle(int x,int y){
		super(x,y);
	}
	public void display(){
		System.out.println("Triangle");
	}
	double area() {return(.5*l*b);}
}

class cuboid extends shape{
	cuboid(int x,int y, int z){
		super(x,y,z);
	}
	public void display(){
		System.out.println("Cuboid");
	}
	double area() {return(l*b*h);}
}

class absclass{
	public static void main(String args[]){
		rect r = new rect(10,20);
		r.display();
		double ra= r.area();
		System.out.println("Area of rectangle is = "+ra);
		
		circle c = new circle(10);
		c.display();
		double ca= c.area();
		System.out.println("Area of circle is = "+ca);

		triangle t = new triangle(10,20);
		t.display();
		double ta= t.area();
		System.out.println("Area of triangle is = "+ta);

		cuboid cu = new cuboid(10,10,10);
		cu.display();
		double cua= cu.area();
		System.out.println("Area of cuboid is = "+cua);
	}
}