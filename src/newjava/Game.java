package newjava;

import java.util.Scanner;
import java.util.Random;

public class Game {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {-1,-1,-1,-1};  
		Random rand = new Random();
		Scanner sc = new Scanner(System.in); 
		//TO CREAT UNREAPETED RANDOM NUMBER
		boolean ky = true;
		while (ky) {
			for (int i = 0; i < a.length; i++) {
				a[i] = rand.nextInt(9);
			}
			int count1 = 0;
			for (int k = 0; k < a.length; k++) {
				for (int z = 0; z < a.length; z++) {
					if (a[k] == a[z]) {
						count1++;
					}
				}
			}
			if (count1 == 4) {
				ky = false;
			}
		}
		//GET NUMBER FROM USER
		boolean s = true;
		int[] b = new int[4];
		int v = 0;
		System.out.println("WELCOME TO NUMBER GUESS GAME");
		System.out.println("-----GUESS FOUR NUMBER------");
		System.out.println();
		int g = 0;
		//LOOP FOR REPET UNTILL FINISH
		for (g = 0; v != 4; g++) {
			v = 0;
			for (int i = 0; i < b.length; i++) {
				System.out.println("ENTER "+(i+1)+"  NUMBER");
				b[i] = sc.nextInt();
			}
			System.out.println();
			for (int c = 0; c < b.length; c++) {
				s = true;
				if (a[c] == b[c]) {
					System.out.println(b[c] + "  CORRECT ");
					System.out.println();
					v++;
					s = false;
				} else if (a[c] != b[c]) {
					int count = 0;
					for (int z = 0; z < a.length; z++) {
						if (a[z] == b[c]) {
							count++;
						}
					}
					if (count == 1) {
						System.out.println(b[c] + "  WRONG POSITION");
						System.out.println();
						s = false;
					}
				}
				if (s) {
					System.out.println(b[c] + "  WRONG NUMBER");
					System.out.println();
				}
			}
			if (v == 4) {
				System.out.println();
				System.out.println("----------------------------");
				System.out.println("WELL DONE...YOU FOUND THAT");
				System.out.println("----------------------------");
			} else if (v == 3) {
				System.out.println();
				System.out.println("JUST ONE STEP AWAY");
				System.out.println();
				System.out.println("---TRY TO GUESS---");
				System.out.println();
			} else {
				System.out.println();
				System.out.println("-------------------");
				System.out.println("AGAIN TRY TO GUESS");
				System.out.println();
			}
		}
		System.out.print("THE RANDOM NUM IS  ");
		for (int k : a) {
			System.out.print(k + "  ");
		}
		System.out.println();
		System.out.println("HEY..YOU GUESSED IN  " + g + "  ATTEMPT");
	}

}
