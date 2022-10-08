package newjava;

public class RecFebpera {
	int y=0;
	int c=1;
	
	void fib(int a) {
		int b=0;
		b=y+c;
		y=c;
		c=b;
		System.out.println(y);
		
		if(b<a) {
			fib(a);
		}
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecFebpera sc=new RecFebpera();
		sc.fib(100);

	}

}
