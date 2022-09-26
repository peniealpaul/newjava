package newjava;

public class Tneb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =120;
		if (a <= 100 && a > 0) {
			System.out.print("0");
		}
		if (a > 100 && a <= 200) {
			int b = a - 100;
			double k = b * 1.5;
			System.out.print(k);
		}
		if (a > 200 && a < 500) {

			int b = (a - 200) * 3;

			int k = b + 200;
			System.out.print(k);
		}
		if (a >= 500) {
			double f = (a - 500) * 6.6;
			double k = 1730+ f;
			System.out.print(k);

		}

	}

}
  