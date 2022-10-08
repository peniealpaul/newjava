package newjava;

public class Try1 {
	int call(int b) {
		if(b>0) {
			
			System.out.println("hey");
		int c= b* call(b-1);
		System.out.println("hi");
			 return c;
			 
		
		}
			System.out.println("hello");
		return 2;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Try1 sc=new Try1();
		int a=sc.call(5);
		System.out.println(a);

	}
	
	
	
	}


