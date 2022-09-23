package newjava;

import java.util.Scanner;

public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		String num = sc.nextLine();
		int i;
		char j;
		for (i = 0, j = 'A'; i <= num.length() - 1; i++, j++) {
			char u = num.charAt(i);
			System.out.println(j + "=" + u);

		}
	}
}
