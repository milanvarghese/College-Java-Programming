interface A{
	final int i=20;
	public void disp();
	public void inc();
}

class B implements A{
	public void disp(){
		System.out.println("BBBBBBBBBB");
	}
	public void inc(){
		System.out.println("I is "+i);
	}
}

class intdemo{
	public static void main(String args[]){
		B b = new B();
		b.disp();
		b.disp();
	}
}