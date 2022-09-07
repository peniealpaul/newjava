package newjava;

public class Addsplitnum {

	public static void main(String[] args) {
		int num=555;
		int r=0;
		/*// TODO Auto-generated method stub
while(num>0){
	 //r+=num%10;
	 

	num=num/10;
	}System.out.println(r);*/
	int g=758;int y=g;
	 int k=0;int l=0;
	while(g>0) {
	k=g%10;
	l=(l*10)+k;
	g=g/10;}
	System.out.println(l);
	if(y==l) {
		System.out.print("palindrom");}
		else
		{
			System.out.print("not palindrom");}
	/*int n=0;
	while(n<100) {
		System.out.println(n);
		n++;*/
	}
	}
	
