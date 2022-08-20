package newjava;
import java.util.Scanner;
public class sample1 {

	public static void main(String arg[]) { 
	Scanner f=new Scanner(System.in);
	do{System.out.print("enter string");
	String k=f.nextLine();
	
	
		char []s1=new char [k.length()];
		for(int l=0;l<=k.length()-1;l++) {
			 s1[l]=k.charAt(l);
		}
		for(int i=0;i<=s1.length-1;i++) {
		 char a=s1[i];
		 int count=0;
		for( int j=0;j<=s1.length-1;j++) {
			
		
			char b=s1[j];
			if(a==b) { 
		count=count+1;
		s1[j]='*';
		}
			}
		if(a=='*'||a==' ') {
			System.out.print("");}
		else {
			System.out.println(a+"="+count);
		
				
			
		}

}}while(true);}}