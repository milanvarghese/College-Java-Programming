import demo.*;
import World.*;

class p1{
    public static void main(String args[]){
        demo.hello h1= new demo.hello();
        h1.call();
        World.hello h2 = new World.hello();
        h2.call();
    }
}