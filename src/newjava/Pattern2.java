package newjava;
import java.util.Scanner;
public class Pattern2 {
	public static void main(String[]arg) {
	System.out.print("enter size of pattern");
	Scanner h=new Scanner(System.in);
	int a=h.nextInt();
	int m=a*2;
	for(int i=0;i<=m;i++) {
	int t=(i<a?i:m-i);
		for(int j=a-t;j>=0;j--) {
			System.out.print("     ");
		}
		for(int k=0;k<=t*10;k++) {
			System.out.print("*");
		}
		for(int n=a-t;n>=m;m--) {
			System.out.print(" ");
		}
	System.out.println();
	
	}
	

}
}