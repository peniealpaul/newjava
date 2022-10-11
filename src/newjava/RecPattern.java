package newjava;

public class RecPattern {
	void pat(int a, int b, int c,int d,int e,int f,int g) {
		if (a > 0) {
			if((b==c)) {
				
			System.out.print(" "+d);
			d++;}
			else if(b==1) {
				
				System.out.print(" "+e);
				e--;}
			else if(a==c) {
				
				System.out.print(" "+f);
				f++;}
			else if(a==1) {
				g--;
				System.out.print(" "+g);
				}
			else 
				System.out.print("  ");
			a--;
			if (a == 0) {
				System.out.println();
				b--;
				pa(b, c,d,e,f,g);
			}
			pat(a, b, c,d,e,f,g);
		}
	}

	void pa(int b, int c,int d,int e,int f,int g) {
		if (b > 0)
			pat(c, b, c,d,e,f,g);
	}

	void p(int a) {
		pat(a, a, a,a-a+1,a,a-a+2,a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecPattern sc = new RecPattern();
		sc.p(5);
	}
}
