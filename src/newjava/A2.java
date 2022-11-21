package newjava;

public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5 };
		int b = 3;
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			j++;
			if (a[i] == b) {
				j++;
				a[i] = a[j];
				j--;
				for (; i < a.length; i++) {

					a[i] = a[j];

					if (j < a.length - 1) {
						j++;
					} else {
						a[a.length - 1] = 0;
					}

				}
			} else {

				a[i] = a[i];

			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}

	}

}
