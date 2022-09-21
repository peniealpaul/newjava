package newjava;

public class dictobin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;
		int i=0;
		int b[]=new int[10];
			while(a>0) {
				b[i]=a%2;
				a=a/2;
				i++;
			
		}
		for(int j=9;j>=0;j--) {
			System.out.print(b[j]);
		}

	}

}
