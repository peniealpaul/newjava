package newjava;

public class Splitnum {

	public static void main(String[] args) {
	int num=7895;
	while(num>0) {
		int r=num%10;
		System.out.println(r);
		num=num/10;
	}

	}

}
