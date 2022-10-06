package newjava;

public class Classmax {
	
	int max (int a,int b,int c) {
		int y=0;
		if((a>b)&&(a>c)) {
			y=a;
			
		}
		if((b>a)&&(b>c)) {
			y=b;
		
		}
		if((c>b)&&(c>a)) {
			y=c;
		
		}
		
		return y ;
		
	}
	int large (int a[]) {
		int y=0;
		for(int b=0;b<a.length;b++) {
			if(y<a[b]) {
				y=a[b];
			
			}
			
		}
		return y;
	}
	int rev(int p) {
		int r=0;
		int g=0;
		while(p>0) {
			r=p%10;
			g=(g*10)+r;
	        p=p/10;
			
		}return g;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Classmax sc=new Classmax();
		//int y=sc.max(10,45,76);
		//System.out.print(y);
		/*int a[]= {1,2,3,4,5,6,7,8};
		int y[]= {56,897,758,588,};
		int f=sc.large(y);
		int u=sc.large(a);
		System.out.println(u);
		System.out.print(f);*/
		int y=98;
		int u=sc.rev(y);
		
		System.out.print(u);

	}

}
