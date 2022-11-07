package newjava;

public class Stringformat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=100000000;
		
		String a=Integer.toString (c);
		String b="";
		b=b+"Rs ";
		int count=0;
		for(int i=0;i<a.length();i++) {
			count++;
			b=b+a.charAt(i);
			if(i<a.length()-3)       
			if(a.length()%2==0) {
				if(count%2==1) {
				b=b+",";}
			}else {
				if(count%2==0) {
					b=b+",";
				}
			}
			   }
		b=b+".00/-";
		System.out.println(b);
}
	}

