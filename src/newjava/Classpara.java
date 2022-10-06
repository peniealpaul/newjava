package newjava;
public class Classpara {
	int add(int a,int b) {
		int c=a+b;
		//System.out.println("add is ="+c);
		return c;
	}
	int sub(int a,int b) {
		int c=a-b;
		//System.out.println("sub is ="+c);
		return c;
	}
	void mul(int a,int b) {
		int c=a*b;
		System.out.println("mul is ="+c);
	}
	void div(int a,int b) {
		int c=a/b;
		System.out.println("div is ="+c);
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Classpara p=new Classpara();
		int a=p.add(5,5);
		System.out.println("add is ="+a);
		int b=p.sub(5,5);
		System.out.println("sub is ="+b);
		p.mul(5,5);
		p.div(5,5);
		}
} 