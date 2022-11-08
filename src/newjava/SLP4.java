package newjava;

public class SLP4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		for(int i=1;i<=5;i++) {
			System.out.print(a+" ");
			if(i==5) {
				System.out.println();
				a+=2;
				if(a<10)
				i=0;
				
			}
		}
		

	}

}
