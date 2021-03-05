//perform complete abstraction and calculate the area of a rectangle, square and a circle

interface shape{
	final float pi = 3.14F;
	public float area(float a, float b);
}

class rect implements shape{
	public float area(float x,float y){
		return (x*y);
	}
}

class square implements shape{
	public float area(float x,float y){
		return (x*x);
	}
}

class circle implements shape{
	public float area(float x,float y){
		return (pi*x*x);
	}
}

class CAArea{
	public static void main(String args[]){
		rect r = new rect(); System.out.println("Area of rect is "+r.area(12,23));
		square s = new square(); System.out.println("Area of square is "+s.area(12,1));
		circle c = new circle(); System.out.println("Area of circle is "+c.area(12,1));
	}
}