package newjava;
public class RecFactpera {
	int Fact(int a){
		if(a>0) {
			  int c=a*	Fact(a-1);
		 return c;
		}
		return 1;
		}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecFactpera sc=new RecFactpera();
		int a=sc.Fact(6);
		System.out.print(a);
}
}
