package newjava;

public class Patin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<11;i++) {
			int b=i<5?i:11-i;
			for(int j=1;j<b;j++) {
				if(i%2==0)
				System.out.print("*");
				else
					System.out.print(j);
				
			}System.out.println();
		}
		
		}
	}
