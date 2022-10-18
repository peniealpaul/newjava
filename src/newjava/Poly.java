package newjava;

public class Poly {
	void a(int a,int b) {
		if(a>b)
		System.out.println("a is big");
		else
			System.out.println("b is big");
	}
	
	
	void a(int a,int b,int c) {
		if((a>b)&&(a>c)){
			System.out.println("a is big");
		}
		else if(b>a&&b>c) {
			System.out.println("b is big");
		}
		else
			System.out.println("c is big");
			
	}
	
	
	
	void a(String a) {
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Poly sc=new Poly();
		sc.a("paul");
		}
}
