package newjava;

public class Classfib {
	int j;
	int f=0;
	int s=1;
	int n=1;
	void fact() {
	for(int i=1;i<=j;i++) {
		System.out.println(f);
		f=s;
		s=n;
		n=f+n;
		
		
	}
		
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Classfib p=new Classfib();
		p.j=10;
		p.fact();

	}

}
