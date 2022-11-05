package newjava;
import java .util.Scanner;

public class Z1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in) ;
	        	System.out.println("enter number of array");
		int   a=sc.nextInt();
		int   b[]=new int[a];
		    System.out.println("Enter value");
		for(int c=0;c<a;c++) {
			 b[c]=sc.nextInt();
		}
		   System.out.println("enter span");
		int e=sc.nextInt();
		for(int f=0;f<e;f++) {
			int y=0;
			for(int k=f;k<a;k=k+e) {
				y=y+b[k];
			}
			System.out.println(y);
		}


	}

}
