package newjava;

public class biginarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {100,85, 0, 20, 18, 17, 2, 10, 13, 12,99, 14, 6, 9, 16, 8 ,27,100};
		int max = a[0];
		int max2 = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {

				max = a[i];

			}
		}

		for (int i = 0; i < a.length; i++) {
			if (max != a[i] && a[i] > max2) {

				max2 = a[i];

			}
		}
		System.out.println("big value in array  "+max);
		System.out.println("2nd big value in array  "+max2);

	}

}
