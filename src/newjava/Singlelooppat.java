package newjava;

public class Singlelooppat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int c=1;
		for(int i=1;i<=100;i++) {
			int b=i%10;
			if(b>a) {
          System.out.print(" "+c);
			c++;}
			else
				System.out.print("  ");
			if(i%10==0) {
				System.out.println();
				c=1;
				a++;
				}
		}
		
		

	}

}
