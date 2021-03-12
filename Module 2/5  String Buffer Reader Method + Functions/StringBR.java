//String BufferReader method
import java.io.*;

class StringBR{
    public static void main(String args[]) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the string ");
            String s = br.readLine();
            System.out.println("String is: "+s);
        } catch (IOException e) {
            System.out.println(e);
            //TODO: handle exception
        }
        
    }
}