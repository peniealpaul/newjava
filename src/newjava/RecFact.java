package newjava;

public class RecFact {
	int c=5;
	int a=1;
void Fact() {
		a=a*c;
		c--;
		if(c>0)
		Fact();
		//System.out.println(a);
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecFact sc=new RecFact();
		sc.Fact();
		System.out.print(sc.a);
		
		

	}

}
