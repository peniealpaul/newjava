package newjava;
import java.util.Scanner;
public class simple2 {
	public static void main(String[]arg) {
	Scanner sc=new Scanner(System.in);
	String n=sc.nextLine();
	System.out.print("enter string");
	char [] a=new char[n.length()];
	for(int t=0;t<=n.length();t++) {
		a[t]=n.charAt(t);
	}
		int c=0;
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]=='#')
				c++;
			else
				System.out.print("");}
			for(int j=1;j<=c;j++) {
				System.out.print("#");
			}
			for(int k=0;k<=a.length-1;k++) {
				if(a[k]=='#') {
				System.out.print("");}
				else
					System.out.print(a[k]);
			}
			
	}}


		
	
