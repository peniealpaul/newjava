package newjava;

public class Arraytryjdupicate {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[] = { 1, 2, 3, 2, 4, 3, 5, 6, 8, 2, 3, 6, 2};
		 int b[]= new int[a.length];
		    int max1 = a[0];
		    int i = 0;
		    int j = 0;
		    int c = 0;
		    int f=0;
		    int count =0;
		    for (i = 0; i < a.length; i++) {
		      if (a[i] > max1) {
		        max1 = a[i];
		        c = i;
		      }
		    }
		    System.out.println("The biggest Number in Array = " + max1);

		    int k[] = new int[max1 + 1];
		    for (i = 1; i <= max1; i++) {
		      System.out.println(k[i] = i);
		    }
		  
		    System.out.println(" found duplicate value ");
		    int fp=0;
		    for (i = 0; i <= max1; i++) {
		      for (j = 0; j < a.length; j++) {
		        if (k[i] == a[j]) {
		        	b[fp++]=a[j];
		        System.out.println(a[j]);}
		      }
		      }for(int p:b) {
		    	  System.out.print(p+" ");
		      }
		    

	}

}*/public static void main(String[] args) {
    int a[] = { 1, 2, 2, 3, 4, 4, 5, 6, 7, 8, 9, 2,9,2 };    
    int i = 0;
    int j = 0;
    int count=0;
   /* int max1 = a[0];
    int count=0;
    for (i = 0; i < a.length; i++) {
      if (a[i] > max1)
        max1 = a[i];
    }
    System.out.println("the biggest number in array " + max1);
    
    int b[] = new int[max1+1];
    for(i=1;i<=max1;i++) {
      b[i]=i;
      System.out.println(b[i]);
    }*/
    System.out.println("lets foundd the duplicate normal");
    for(i=0;i<a.length;i++) {
    	count=0;
      for(j=0;j<a.length;j++) {
        if((a[i]==a[j])&&(j<=i))
        count++;
        
      }if(count>1) {System.out.println(a[i]);
    	  
      }
    }
    
    }
}
