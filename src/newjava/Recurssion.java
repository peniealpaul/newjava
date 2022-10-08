package newjava;

public class Recurssion {
	
	void loop(int n) {
		System.out.println(n);
		n++;
		if(n<=20)
		loop(n);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recurssion sc=new Recurssion();
		sc.loop(1);
		}

}
