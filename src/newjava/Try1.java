package newjava;

public class Try1 {
	int call(int b,int c) {
		if(b>0) {
			
			System.out.println("hey");
		 c= c+call(b-1,c);
		System.out.println("hi");
			 return c;
			 
		
		}
			System.out.println("hello");
		return c;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Try1 sc=new Try1();
		int a=sc.call(5,0);
		System.out.println(a);

	}
	
	
	
	}


