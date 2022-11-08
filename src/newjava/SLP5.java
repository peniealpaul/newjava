package newjava;

public class SLP5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		for(int i=1;i<=5;i++) {
			System.out.print(a+" ");
			if(i==5) {
				System.out.println();
				a--;
				if(a>0)
				i=0;
				
			}
		}

	}

}
