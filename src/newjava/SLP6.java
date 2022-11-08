package newjava;

public class SLP6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		for(int i=5;i>=1;i--) {
			System.out.print(i+" ");
			if(i==1) {
				System.out.println();
				a--;
				if(a>0)
				i=6;
				
			}
		}

	}

}
