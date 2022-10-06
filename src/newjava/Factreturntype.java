package newjava;

public class Factreturntype {

	int fact (int k) {
		int f=1;
	for(int i=2;i<=k;i++) {
		f=f*i;
		}
	return f;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factreturntype p=new Factreturntype ();
		for(int i=1;i<=5;i++) {
		int y=p.fact(i);
		System.out.println(y);
		

	}

}}
