package newjava;
import java.util.Scanner;

public class palindrome {

		   public  static void main(String []args) {
			  Scanner d=new Scanner(System.in);
			  System.out.println("enter string");
			  do{String s1=d.nextLine();

		    String  s2= "";
		    
		    int strLength = s1.length();

		    for (int i = (strLength - 1); i >=0; --i) {
		      s2 = s2 + s1.charAt(i);
		    }

		    if (s1.toUpperCase().equals(s2.toUpperCase())) {
		      System.out.println(s1 + " is a Palindrome String.");
		    }
		    else {
		      System.out.println(s1+ " is not a Palindrome String.");
		    }}while(true);
		  
		}
		  
}
