package newjava;
import java.util.Scanner;
public class simple {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a=new String("paul");
Scanner h=new Scanner(System.in);
System.out.println("enter email id");
String t=h.nextLine();

if((a.equals(t))) {
	String b=new String( "12345");
	System.out.print("enter password");
	String k=h.nextLine();
	if(b.equals(k)) {
		
			 
			System.out.print("enter size of pattern");
			Scanner u=new Scanner(System.in);
			int y=u.nextInt();
			int m=y*2;
			for(int i=0;i<=m;i++) {
			int o=(i<y?i:m-i);
				for(int j=y-o;j>=0;j--) {
					System.out.print(" ");
				}
				for(int q=0;q<=o;q++) {
					System.out.print("* ");
				}
				for(int n=y-o;n>=m;m--) {
					System.out.print(" ");
				}
			System.out.println();
			
			}
			
			
			
	}
			
		
	
	else
		{System.out.print("invalid password");}
}
else
	System.out.print("invalid email");
	}

}
