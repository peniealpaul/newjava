package newjava;
import java.util.Scanner;
public class Primenum {
	

		public static void main(String[] args) {
			int a;
			Scanner sc=new Scanner(System.in);
			System.out.print("enter number");
			a=sc.nextInt();
					System.out.println("the prime numbers are");
		for(int j=2;j<=a;j++) {
	boolean l=true;
	for(int i=2;i<j/2;i++) {
	if(j%i==0)
		{
		l=false;}}
			if(l) {
	System.out.println(j);
		}}}}





