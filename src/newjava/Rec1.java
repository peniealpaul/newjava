package newjava;

public class Rec1 {
int n=0;
	
	int m1(int n) {n++;  
		System.out.println(n);
		
		if(n<=10) {
			
			m1(n);
			
		}System.out.println(n);
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rec1 sc=new Rec1();
		//sc.m1();
		int k=sc.m1(1);
		System.out.print(k);

	}

}
