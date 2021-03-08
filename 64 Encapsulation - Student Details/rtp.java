class parent{
    void run(){
        System.out.println("Parent running");
    }
}
class child1 extends parent{
    void run(){
        System.out.println("child1 running");
    }
}
class child2 extends parent{
    void run(){
        System.out.println("child2 running");
    }
}

public class rtp{
    public static void main(String args[]){
        parent p= new parent(); p.run();
        parent c1= new child1(); c1.run();
        child2 c2= new child2(); c2.run();
    }
}