;;package newjava;

public class Array2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 5, 7, 8, 9, 6, 8,67, 89, 71, 5, 5 };
		int b = 0;
		for (int i = 0; i < a.length; i++) {
			if (b < a[i]) {
				b = a[i];
			}
		}
		System.out.println();
		int t = 0;
		for (int i = 0; i < a.length; i++) {
	
				if ((t < a[i])) 
				{ if(a[i]!=b){
					
					t = a[i];}}
			
		}
		System.out.println(t);
	/*	int t=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(t<a[j]) {
					t=a[j];
				}}}
				System.out.println(t);*/
			}
		
		
		
		
		
		
		
} 