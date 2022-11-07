package newjava;
public class Protechsoftpattern2 {
	void call(int a) {
		pat(1,1,a);}
	void pat(int a,int b,int d) {
		if(b+a>d) {
		if(b%2==1)
		System.out.print(b+" ");
		else
			System.out.print("# ");}
		else
			System.out.print("  ");
		a++;
		if(a==d+1) {
			System.out.println();
			pa(a,b,d);
		}else
			pat(a,b,d);
		}
	void pa(int a, int b,int d) {
		b++;
		if(b!=d+1) {
			a=1;
			pat(a,b,d);
		}}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Protechsoftpattern2 sc=new Protechsoftpattern2();
          int i=5;
          sc.call(i);}}
