package newjava;
import java.util.Scanner;
public class factors {

	public static void main(String[] args) {
		//to find factors of given number
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		sc.close();
		System.out.print("the factors of given number is=");
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				System.out.print(i+",");
			}
		}

	}

}
