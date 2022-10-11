package newjava;
import java.util.Scanner;
public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=0;
		int m=0;
		//System.out.println();
		System.out.println(" enter length");
		int a=sc.nextInt();
		int arr[]=new int [a];
		
		System.out.println("enter array");
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
		}System.out.println(" the result");
		
		
		
		
	for(int k:arr) {
			if(k<0) {
			n++;	
			}
		}int b[]=new int[n];
		for(int i=0;i<a;i++) {
			if(arr[i]<0) {
				System.out.print(arr[i]);
			b[m]=arr[i];
			m++;
			
		}
	}
		}
		}


