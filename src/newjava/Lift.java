package newjava;

import java.util.Scanner;

public class Lift {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lift[] = new int[6];
		boolean dirction[] = new boolean[6];
		int distance[] = new int[6];
		boolean oourdirction;
		int ourloction;
		char ourd;
		Scanner sc = new Scanner(System.in);
		Scanner st = new Scanner(System.in);
		for (int i = 0; i < lift.length; i++) {
			System.out.println("ENTER " + (i + 1) + " LEFT LOCATION AND LIFT DIRECTION");
			lift[i] = sc.nextInt();
			char f = st.next().charAt(0);
			if (f == 'u' || f == 'U') {
				dirction[i] = true;
			} else if (f == 'd' || f == 'D') {
				dirction[i] = false;
			} else {
				System.out.println("INVALID DIRECTION ENTERED ---TAKE AS UP");
				dirction[i] = true;
			}
		}
		
		System.out.println("ENTER YOUR FLOOR AND DIRECTION");
		 ourloction = sc.nextInt();
		 ourd = st.next().charAt(0);
		if (ourd == 'u' || ourd == 'U')
			oourdirction = true;
		else if (ourd == 'd' || ourd == 'D')
			oourdirction = false;
		else {
			System.out.println("INVALID DIRECTION ENTERED ---TAKE AS UP");
			oourdirction = true;
		}

		/*lift[0]=1;dirction[0]=true;
		lift[1]=5;dirction[1]=true;
		lift[2]=7;dirction[2]=false;
		lift[3]=8;dirction[3]=true;
		lift[4]=4;dirction[4]=false;
		lift[5]=3;dirction[5]=true;
		
		
		
		oourdirction=false;
		ourloction=5;*/
		
		if (oourdirction) {
			for (int i = 0; i < lift.length; i++) {
				if (ourloction == lift[i] && dirction[i] == oourdirction) {
					distance[i] = 0;
				}

				else if (dirction[i]) {
					if (ourloction <= lift[i]) {
						distance[i] = ((10-ourloction)+10)+(3-lift[i]);
					} else
						distance[i] = 10 - lift[i];
				} else {
					distance[i] = (lift[i]) + ourloction;
				}
			}
		}
		if (!oourdirction) {
			for (int i = 0; i < lift.length; i++) {
				if (ourloction == lift[i] && dirction[i] == oourdirction) {
					distance[i] = 0;
				} else if (!dirction[i]) {
					if (ourloction >= lift[i]) {
						distance[i] = (lift[i] + 10) + (-(ourloction - 10));
					} else
						distance[i] = lift[i] - ourloction;
				} else {
					distance[i] = (10 - lift[i]) + (10 - ourloction);
				}
			};
			}
		for(int k:distance) {
			System.out.println(k);}
		int low = distance[0];
		int in = 0;
		for (int i = 0; i < distance.length; i++) {
			if (low >= distance[i]) {
				low = distance[i];
				in = i + 1;
			}
		}
		System.out.print("LEFT " + in + " IS come");
	}
}
