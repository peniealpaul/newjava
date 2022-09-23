package newjava;

public class array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 2, 3, 7, 6 };
		for (int k = 0; k < 1; k++) {
			int b = a[a.length-1];

			for (int i = a.length-1; i <0; i++) {

				a[i-1] = a[i];

			}
			a[a.length-1] = b;
		}

		for (int j = 0; j <= a.length - 1; j++) {

			System.out.println(a[j]);

		}

	}

}
