package newjava;

public class Findfirstrepeatchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "opuymmorphism";
		int b = 0;
		int i = 0;
		int j = 0;
		int count = 0;
		for (j = 0; j < a.length() * a.length(); j++) {
			if (j > 0) {
				if (j % a.length() == 0) {
					count = 0;
					i++;
				}
			}
			b = j % a.length();
			if (a.charAt(i) == a.charAt(b)) {
				count++;
			}
			if (j % a.length() == a.length() - 1) {
				if (count > 1) {
					System.out.println(a.charAt(i));
					break;

				}

			}

		}
	}
}
