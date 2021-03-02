//Q.Show static binding?

class car{
	public static void start(){
		System.out.println("Car start");
	}
}

class maruthi extends car{
	public static void start(){ //static binding will override and prevent start() from changing
		System.out.println("Maruthi start");
	}
}

class staticbinding{
	public static void main(String args[]){
		car c= new car();
		c.start();
		car m= new maruthi();
		m.start();
	}
}