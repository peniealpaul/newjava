package newjava;

public class Classmark {
	int m1,m2,m3,m4,m5;
	String d;
	void total() {
		System.out.println(d+"  THE TOTAL = "+(m1+m2+m3+m4+m5));
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Classmark m1=new Classmark();
		Classmark m2=new Classmark();
		m1.d="arun";
		m1.m1=10;
		m1.m2=10;
		m1.m3=10;
		m1.m4=10;
		m1.m5=10;
		m2.d="paul";
		m2.m1=10;
		m2.m2=10;
		m2.m3=10;
		m2.m4=10;
		m2.m5=10;
		m1.total();
		m2.total();
		
	}

}
