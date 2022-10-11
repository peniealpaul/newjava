package newjava;
import java.util.Scanner;
public class Electronic {
	Scanner sc=new Scanner(System.in);
	void name() {
		System.out.println("ENTER NAME");
		String a=sc.nextLine();
		
		System.out.println("ENTER NUMBER");
		String b=sc.nextLine();
		System.out.println("WELCOME  "+a);
		
		System.out.println("YOUR NUMBER  ");
		System.out.println(b);
		System.out.println();
		}
	void num(int a[]) {
		double g=0;
		double d=0;
		for(int k:a) {
			double c=cal(k);
			 g=g+k;
			 d=d+c;
			System.out.println(k+"          = "+c);
		}double u=d-g;
		System.out.println("THE TOTAL      = "+g);
		System.out.println("DISC AMOUNT    = "+u);
		System.out.println("NET PAY        = "+d);
		
	}
	
	double cal(int k) {
		double d=0;
		if((k>0)&&(k<=25000)){
			int a=k/100;
			 d=a*95;
			
		}
		if((k>25000)&&(k<=50000)){
			int a=k/100;
			 d=a*92.5;
		}
		if((k>50000)&&(k<=100000)){
			int a=k/100;
			 d=a*90;
		}
		if(k>100000){
			int a=k/100;
			 d=a*85;
		}
		
		
		return d;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Electronic s=new Electronic();
		Scanner sc=new Scanner(System.in);
		
		s.name();
		System.out.println("ENTER NUMBER OF LAPTAB");
		int a=sc.nextInt();
		int b[]=new int[a];
		for(int i=0;i<b.length;i++) {
			System.out.println("ENTER "+(i+1)+" LAPTAB PRICE");
			b[i]=sc.nextInt();
		}System.out.println("MRP            DISC PRICE");
		s.num(b);
		System.out.println();
		System.out.println();
		System.out.println("THANK U...COME AGAIN");

	}

}
