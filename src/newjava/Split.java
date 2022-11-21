package newjava;
public class Split {
	String[] sp(String a, String b) {
		String c[];
		int count = 0;
		String h = "";
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == b.charAt(0)) {
				count++;}}
		int j = 0;
		c = new String[count + 1];
		h = "";
		for (int i = 0; i < a.length(); i++) {
			boolean y = true;
if (a.charAt(i) == b.charAt(0)) {
				h = "";j++;
				y = false;
				continue;}
			h = h + a.charAt(i);
			if (y) {
				c[j] = h;}}
		return c;}
public static void main(String[] args) {
		Split sc = new Split();
		String a = "21/11/2022";
		String key = "/";
		String b[] = sc.sp(a, key);
		//print the array using for each
		for (String k : b) {
			System.out.println(k);}
			 a="siva kesavan madurai tamilnadu";
			 key=" ";
			 String c[] = sc.sp(a, key);
			for (String k : c) {
				System.out.println(k);}}}
