package newjava;

public class Protechsoftpattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 8;
		for (int a = 0; a <= i; a++) {
			int b = a <= i / 2 ? a : i - a + 1;
			for (int c = 0; c < b; c++) {
				if (c % 2 == 1)
					System.out.print("#");
				else
					System.out.print(a);
			}
			System.out.println();
		}

	}

}
