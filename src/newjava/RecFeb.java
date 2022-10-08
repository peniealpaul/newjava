package newjava;

public class RecFeb {
	int a=0;
	int b=1;
	int c;
	void Feb(){
		System.out.println(a);
		c=a+b;
		a=b;
		b=c;
		if(a<100)
		Feb();
		
		
	}

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecFeb sc=new RecFeb();
		sc.Feb();
		

	}

}
