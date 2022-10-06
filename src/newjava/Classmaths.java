package newjava;

public class Classmaths {

	
	int a,b;
	void add() {
		System.out.println(a+b);
	}
	void sub() {
		System.out.println(a-b);
	}
	void mul() {
		System.out.println(a*b);
		
	}
	void div() {
		System.out.println(a/b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Classmaths p=new Classmaths();
		p.a=5;
		p.b=3;
		 p.add();
		 p.sub();
		 p.mul();
		 p.div();

		}
}
