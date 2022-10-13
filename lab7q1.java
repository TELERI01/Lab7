package cs130class;

import java.util.Scanner;

public class lab7q1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int cap, amount, level;
		
		System.out.println("Enter gas capacity");
		cap = scan.nextInt();
		System.out.println("Enter gas amount");
		amount = scan.nextInt();
		
		level = amount/cap;
		
		if(level<.25) {
			System.out.println("Level less than a quarter of a tank.");
		}
		else if(level<.50) {
			System.out.println("Level less than half of a tank.");
		}
		else if(level<.75) {
			System.out.println("Level less than three quarters.");
		}
		else if(level<=100) {
			System.out.println("Level is almost full tank");
		}
		else {
			System.out.println("Invalid!");
		}
		
	}

}
