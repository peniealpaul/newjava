package newjava;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	/*	String s="1234567890";
		int l=s.length();
				if (l==10) {
					System.out.println("it is mobile number");
				}
				else
					System.out.println("invalid");*/
				
		/*String name="Abcdefghijklmnopqrstuvwxyz";
		String na=name.toLowerCase();
		//int s=name.length();
		//System.out.println(s);
				for(int i=0;i<name.length();i++) {
				char b=na.charAt(i);
				//char a=name.charAt(i);
				if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u') {
				
				
				
				System.out.println(b);
				}*/
						
			/*	String a="penieal";
				String b=a.substring(2,7);
				System.out.println(b);*/
		String pincode="chennai67576576";
		int l=pincode.length();
		boolean o=false;
		for(int i=0;i<l;i++) {
			char k=pincode.charAt(i);
			//int b=pincode.charAt(i);
			
			if('0'<=k&&'9'>=k) {
			System.out.println(k);
				o=true;
				}}
			
			
			if(o) {
				System.out.println("contain number");}
				else {
					System.out.println("not have number");
				}
		
		
		/*String g ="hello";
		char b=g.charAt(0);
		System.out.println(b);*/
		/*for(char a=99;a<=120;a++) {
			System.out.println(a);*/
		}
		
	
	}


