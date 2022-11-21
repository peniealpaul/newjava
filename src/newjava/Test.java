package newjava;

public class Test {
public static void main(String[] args) {
	int a=10;
	for(int i=0;i<=a;i++) {
		for(int j=0;j<=a;j++) {
			if((i==0)||(j==a/2)||(i==1)||((i==a||i==a-1)&&(j<a/2)))
			System.out.print("**");
			
			else
				System.out.print("  ");
		}System.out.println();
	}
	/*void no1(int b) {
		System.out.println("Printing 1 4 27 256");
		int a = 1;
		for (int i = 1; i <= b; i++) {
			a = 1;

			for (int j = 1; j <= i; j++) {
				a = a * i;
			}
			System.out.println(a);

		}
	}

	void no2(int b) {
		System.out.println();
		System.out.println("Printing 5 power 4  " + "4 power 3" + "3 power 2" + "2 power 1" + "1 power 0");
		int a = 1;
		for (int i = b; i >= 1; i--) {
			a = 1;

			for (int j = 1; j < i; j++) {
				a = a * i;
			}
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		Test sc = new Test();
		sc.no1(4);
		sc.no2(5);*/

	}

}
