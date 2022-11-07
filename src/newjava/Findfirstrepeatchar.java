package newjava;

public class Findfirstrepeatchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="luymmorphism";
		for(int i=0;i<a.length();i++) {
			int count=0;
			for(int j=0;j<a.length();j++) {
				if(a.charAt(i)==a.charAt(j)) {
					count++;
				}
				}if(count>1) {
					System.out.println(a.charAt(i));
					break;
			}
		}

	}

}
