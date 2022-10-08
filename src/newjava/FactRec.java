package newjava;

public class FactRec {
int Fact(int n) {
	if(n>1) {
		int f=Fact(n-1);
		return n*f;
	}else {
		return 1;
	}
	
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactRec sc=new FactRec();
		int a=sc.Fact(5);
		System.out.println(a);
	}

}
