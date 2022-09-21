package newjava;

public class Sumofdigitinoned {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =1333;
		int b = 0;
		int c;
		int e;
		while (a > 0){
			c = a % 10;
			b = b + c;
			a = a / 10;
System.out.println(b+"  8");
		if (b > 9) {
			e = b % 10;
			b = b / 10;
		   b=b+e;
		   }
		}
		System.out.print(b+"  4");
}}
