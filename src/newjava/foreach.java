package newjava;

public class foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {7,9,2,3,13,4,5};
		for(int b:a)   {
			boolean c = true;
			for (int i = 2; i<b; i++) {
				if (b%i == 0) {
					c = false;
				}
			}
			if (c) {
				System.out.println(b);

			}
			}
		}
}
