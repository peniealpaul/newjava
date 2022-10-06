package newjava;

public class Classstudent1 {
	
	int rollno;
	String name;
	int mark;
	char grade;
	
	void setgrade() {
		
		System.out.println("THE ROLL NO  "+rollno);
		System.out.println("THE NAME  "+name);
		System.out.println("THE MARK  "+mark);
		System.out.print("THE GRADE ");
		if(mark<=100&&mark>=91) {
			System.out.println("A");
		}
		if(mark<=90&&mark>=81) {
			System.out.println("B");
		}
		if(mark<=80&&mark>=71) {
			System.out.println("C");
		}
		if(mark<=70&&mark>=61) {
			System.out.println("D");
		}
		if(mark<=60&&mark>=51) {
			System.out.println("E");
		}if(mark<=50&&mark>=0) {
			System.out.println("F");}
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Classstudent1 s1=new Classstudent1();
		Classstudent1 s2=new Classstudent1();
		s1.rollno=100;
		s1.name="JOHN";
		s1.mark=81;
		s1.setgrade();
		
		s2.rollno=200;
		s2.name="PAUL";
		s2.mark=70;
		s2.setgrade();
		
		
		
		
		

	}

}
