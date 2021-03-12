//String BufferReader method
import java.io.*;

class StringFn{
    public static void main(String args[]) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter string 1");
            String s1 = br.readLine();
            System.out.println("String 1 is: "+s1);
            System.out.println("Enter string 2");
            String s2 = br.readLine();
            System.out.println("String 2 is: "+s2);

            System.out.println("Length: "+s1.length());
            System.out.println("codePointAt: "+s1.codePointAt(5));
            System.out.println("concatination: "+s1.concat(s2));
            System.out.println("Substring: "+s1.substring(3));
            System.out.println("Substring: "+s1.substring(3,5));
            System.out.println("Replace: "+s1.replace("a","e"));
            System.out.println("Trim: "+s1.trim());
            System.out.println("toUpperCase: "+s1.toUpperCase());
            System.out.println("toLowerCase: "+s1.toLowerCase());
            System.out.println("CompareTo: "+s1.compareTo(s2));

            System.out.println("   ");
            System.out.println("Boolean Methods");
            System.out.println("Equals: "+s1.equals(s2));
            System.out.println("SubstrinsEquals: "+s1.equals(s2.substring(3,4)));
            System.out.println("Ignore Case: "+s1.equalsIgnoreCase(s2.substring(3,4)));
            System.out.println("=="+s1==s2);
            System.out.println("Starts: "+s1.startsWith("Ra"));
            System.out.println("Ends: "+s1.endsWith("ri"));

        }
}