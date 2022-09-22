package newjava;

public class array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int a[]= {1,2,3,7,6};
		for(int k=0;k<6;k++) {
		int b=a[a.length-1];
		
		for(int i=a.length-1;i>0;i--) {
			
		a[i]=a[i-1];
		
		}a[0]=b;}
		
for(int j=0;j<=a.length-1;j++) {
	
	System.out.println(a[j]);

}
		/*int a[]= {1,2,3,4,5,6,7,8,12};
		int b=a[a.length-1];
		System.out.println(b);*/
		
		
	}

}
