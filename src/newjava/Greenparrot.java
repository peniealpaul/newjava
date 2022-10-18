package newjava;

public class Greenparrot extends Parrot {
	Greenparrot(){
		System.out.println("Greenparrot");
	}
	int a=5;
	void smile() {
		int a=8;
		Bird sc=new Bird();
		System.out.println("smile "+sc.a+"   "+super.a+"  "+a+" "+this.a);
		
	}
}
