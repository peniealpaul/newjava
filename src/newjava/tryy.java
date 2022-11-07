package newjava;

class tryy {
	public static void main(String[] args) {

		
		for (int i = 0; i < 10; i++) {
			int b=i<5?i:10-i;
			
			for(int j=0;j<b;j++) {
				if(i%2==0)
				System.out.print("*");
				else
					System.out.print(i);
			}System.out.println();
		}

	}
}
