class car{
	car disp(){
		System.out.println("CARRRR");
		return(this);
	}
}

class benz extends car{
	benz disp(){
		System.out.println("Benz");
		return(this);
	}
}

class cov{
	public static void main(String args[]){
		car r=new car(); r.disp();
		benz z= new benz(); z.disp();
	}
}