package newjava;

public class A4 {
	int [] swapleft(int a[]) {
		int b = a[0];
		for (int i = 0; i < a.length - 1; i++) {
			a[i] = a[i + 1];
		}
		a[a.length - 1] = b;
		
		
		
		return a;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		A4 sc=new A4();
		// method call by two times soo swap left two times occures
		sc.swapleft(a);
	int b[]	=sc.swapleft(a);
	//to print array in for each
	for (int k : a) {
		System.out.print(k + " ");
	}

	}

}
