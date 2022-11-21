package newjava;

public class Trytext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a = 1234
				;
		int count = 0;
		int c = a % 10;
		a = a / 10;
		while (a > 0) {
			int b = a % 10;
			a = a / 10;
			if (c < b) {
				count = 1;
			}
			c = b;
		}
		if (count == 1) {
			System.out.println("not");
		} else {
			System.out.println("yes");
		}*/
		int [] a= { 10,11,12,14,15,19,17,23,43,32,33};
//      0  1   2 3  4   5  6  7  8  9 10
int num;
int len= a.length;
int[] b=new int[len];
for(int i=0;i<a.length;i++) {
if(i%2==0) {
 b[i]=a[i];
//System.out.println(b[i]);   10,12,15,17,43,33
   //                          0  1  2  3  4  5
}
  }
for(int i=0;i<b.length;i++) {
if(b[i]%2!=0) {
num =b[i];
System.out.println("The odd elements present in the even index is " + num);
}
}

	}

}
