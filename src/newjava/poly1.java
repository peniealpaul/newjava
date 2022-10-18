package newjava;

public class poly1 {
	
	 int a;
	poly1(){
		a=5;
	}
	poly1(int b){
		 a=b;}
	
	 void a(byte a) {
		System.out.println("byte "+a);
	}
	void a(int a) {
		System.out.println("int "+a);
	}
	void a(double a) {
		System.out.println("double "+a);
	}
	void a(String a) {
		System.out.println("String "+a);
	}
	void a( int a[]) {
		System.out.println("Array "+a);
	}
	void a(char a) {
		System.out.println("char "+a);
	}
	void a(float a) {
		System.out.println("float "+a);
	}
	void a(long a) {
		System.out.println("long "+a);
	}
	void a(boolean a) {
		System.out.println("boolean "+a);
	}
	void a(short a) {
		System.out.println("short "+a);
	}
void b() {
	System.out.println(a);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a=0;a<10;a++) {
			a=0;
		}
		poly1 sc=new poly1(4);
	
		sc.b();

	}
}
