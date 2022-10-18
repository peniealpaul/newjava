package newjava;

public class Dimond2for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
for(int i=0;i<=n;i++) {
	for (int j=0;j<=n;j++){
		int b=i>n/2?i:n-i;
		if(b<=j)
		System.out.print(" *");
		else if(j>(n/2-1))
			System.out.print(" ");
		}System.out.println();
    }
	}
	}
