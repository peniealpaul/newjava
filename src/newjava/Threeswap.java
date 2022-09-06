package newjava;

public class Threeswap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=15;
int b=10;
int c=5;
System.out.println("BEFORE SWAP");
System.out.println("A="+a);
System.out.println("B="+b);
System.out.println("C="+c);
a=a+c;
c=a-c;
a=a-c;
b=b+a;
a=b-a;
b=b-a;
System.out.println("AFTER SWAP");
System.out.println("A="+a);
System.out.println("B="+b);
System.out.println("C="+c);
	}

}
