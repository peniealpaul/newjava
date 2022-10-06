package newjava;

public class Classstudent {
	
		
			int roll;
		String name;
		int mark;
		void print() {
		System.out.println("ROLL NO "+roll);	
		System.out.println("NAME    "+name);
		System.out.println("MARK    "+mark);
		System.out.println();
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Classstudent s1=new Classstudent();
		Classstudent s2=new Classstudent();
		Classstudent s3=new Classstudent();
		
		s1.roll=1;
		s1.name="paul";
		s1.mark=50;
		s2.roll=2;
		s2.name="john";
		s2.mark=60;
		s3.roll=3;
		s3.name="REVENUE lingesh";
		s3.mark=70;
		
		s1.print();
		s2.print();
		s3.print();
		
		
		
		
		//System.out.println(s1);
		
			/*System.out.println("ROLL NO "+s1.roll);	
			System.out.println("NAME    "+s1.name);
			System.out.println("MARK    "+s1.mark);	
			System.out.println("ROLL NO "+s2.roll);	
			System.out.println("NAME    "+s2.name);	
			System.out.println("MARK    "+s2.mark);	*/
	}

}
