package newjava;

public class SLP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		for (int i = 5; i > 0; i--) {
			System.out.print(a+" ");
			if (i == 1) {
				System.out.println();
				i = a;
				a--;
			}
		}

	}
}
