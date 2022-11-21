package newjava;

public class Try123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int y=true?10:20;
		System.out.print(y);
		
		
		
		boolean a[]=new boolean[2];
		a[1]=true;
		System.out.print(a[1]);*/
//final int a=10;
//System.out.println(a);

//System.out.println(a);
		 int[] a= {11,75,99,34,44,90,67,42,68,97,77};
	        //         0  1  2  3  4  5  6  7  8  9  10
	  int n;
	  int len=a.length;
	  int[] b=new int[len];
	  for(int i=0;i<a.length;i++) {
	     if(i%2!=0) {
	       b[i]=a[i];
	     //  System.out.print(b[i] + " ");    75 34 90 42 97 
	                         //                0  1 2  3  4
	     }
	     
	  }
	  for(int i=0;i<b.length;i++) {
	     if(b[i]%2==0) 
	     {
	        n=b[i];
	       System.out.println(" The even elements present in the odd index is " + n);
	      
	     }
	  }

	}

}
