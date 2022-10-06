package newjava;
import java.util.Scanner;
public class Classatm {
	
	int a;
	void atm() {
		int b=a/500;
		System.out.println("500  *  "+b);
		int u=b*500;
		int c=a-u;
		int k=c/200;
		System.out.println("200  *  "+k);
		int y=k*200;
		int h=y+u;
		int j=a-h;
		int g=j/100;
		System.out.println("100  *  "+g);
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Classatm p=new Classatm();
		Scanner sc=new Scanner(System.in);
		boolean c;
		do{System.out.println("enter amount");
			p.a=sc.nextInt();
		if(p.a%100==0) {
			p.atm();}
		else {
			System.out.println("Invalid ");
		}
		System.out.println("To continue enter 1");
		System.out.println("To exit enter 0");
		int b=sc.nextInt();
		 c=b==1?true:false;
		
		}while(c);

	}
	

}
