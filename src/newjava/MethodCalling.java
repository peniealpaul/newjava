package newjava;

public class MethodCalling {

		int n=2;
		int k=1;
		
		void m1()
		{
			System.out.println(k+" * 2 = "+n);
			n=n+2;
			k++;
			if(k<=10)
			m1();
		
		}
		/*void m2()
		{
			System.out.println(n);
			n++;
			m3();
		}
		void m3()
		{
			System.out.println(n);
			n++;
			m4();
		}
		void m4()
		{
			System.out.println(n);
			n++;
		
		}*/
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
MethodCalling sc=new MethodCalling();
sc.m1();
			
		
		
		
		
		
		

	}

}
