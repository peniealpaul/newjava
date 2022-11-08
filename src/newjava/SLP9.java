package newjava;

public class SLP9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int b=5;
		for(int i=1;i<=a;i++) {
			System.out.print(b+" ");
			if(i==a&&a<5) {
				System.out.println();
				i=0;
				a++;
				b--;
			}
		}

	}

}
