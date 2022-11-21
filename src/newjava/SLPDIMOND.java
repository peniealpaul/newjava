package newjava;

public class SLPDIMOND {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 16;
		int j = 0;
		int i=0;
		while ( i <= n * n) {
			int c = i % n;
			if (i % n == 0)
				j++;
			
				int b = j > n / 2 ? j : n - j;
				if (b <= c)
					System.out.print(" *");
				else if (c > (n / 2 - 1))
					System.out.print(" ");
			
			if (c == 0)
				System.out.println();
			i++;
		}
	}
}
