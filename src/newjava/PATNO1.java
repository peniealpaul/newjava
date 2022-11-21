package newjava;

public class PATNO1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = -1;
		for (int i = 0; i < 100; i++) {
			int a = i % 10;
			if (a % 10 == 0) {
				j++;

			}
			if ((a == 4) || (a == 5) || (a == 6))
				System.out.print("* ");
			else
				System.out.print("  ");

			if (a == 9) {
				System.out.println();
			}
		}

	}

}
