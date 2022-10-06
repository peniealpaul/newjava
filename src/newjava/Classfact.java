package newjava;

public class Classfact {
	int a;
	int b = 1;

	void fact() {
		b = 1;
		for (int i = 1; i <= a; i++) {
			b = b * i;
		}
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 6;
		Classfact p = new Classfact();
		for (int j = 1; j <= a; j++) {
			p.a = j;
			p.fact();
		}

	}}


