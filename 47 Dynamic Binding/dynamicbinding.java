//Q.Show static binding?

class car{
	public void start(){
		System.out.println("Car start");
	}
}

class maruthi extends car{
	public void start(){ //dynamic binding will override and  start() will changing
		System.out.println("Maruthi start");
	}
}

class dynamicbinding{
	public static void main(String args[]){
		car c= new car();
		c.start();
		car m= new maruthi();
		m.start();
	}
}