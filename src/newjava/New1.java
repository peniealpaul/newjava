package newjava;

public class New1 {
	public static void main(String arg[]) {

		int n = 0;

		call(n);
	}

	 public static void call(int n) {
		n++;
		System.out.println(n);
		if (n < 10) {
			call(n);
		}
	}

}
