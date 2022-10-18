package newjava;

public class Patternfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=0;i<=100;i++) {
	if((i%10==0)&&(i!=100)) {
		System.out.println();
		System.out.print("  *");
	}
	else if(i%10!=0)
		System.out.print(" *");
}
		
	}

}
