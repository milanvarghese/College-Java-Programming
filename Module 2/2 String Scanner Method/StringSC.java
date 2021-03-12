//String Scanner method
import java.util.*;

class StringSC{
    public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string ");
            String s = sc.nextLine(); //next will only read one word... nextline will read the whole line
            System.out.println("String is: "+s);
    }
}