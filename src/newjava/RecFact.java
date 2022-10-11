package newjava;

public class RecFact {
	int a=0;
	
	
	void fact(int b) {
		
		if(b>0){
			b--;
			
			Fac(b);
			
			
		}
		
	}
	
	
int Fac(int a) {
		if(a>0) {
			  int c=a*	Fac(a-1);
			  System.out.println(c);
		 return c;
		}
		return 1;
		}

		
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecFact sc=new RecFact();
		sc.fact(10);
		
		
		

	}

}
