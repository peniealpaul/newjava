package newjava;

public class Fibanaocii {

	public static void main(String[] args) {
		int f=0;
		int s=1;
		int n=0;
		for(int i=0;i<10;i++) {
			System.out.println(n);
			f=s;
			s=n;
			n=f+s;
		}
		// TODO Auto-generated method stub

	}

}
