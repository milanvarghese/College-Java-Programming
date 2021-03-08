class parent{}

class child1 extends parent{}
class child2 extends parent{}


class gchild11 extends child1{}
class gchild21 extends child2{}


public class instance{
	public static void main(String args[]){
		parent p =new parent();
		
		child1 c1 = new child1();
		child2 c2 = new child2();
		
		gchild11 gc11 = new gchild11();
		gchild21 gc21 = new gchild21();
		
		System.out.print("gc11 instanceof parent: ");
		System.out.print(gc11 instanceof parent);
	}
}