package cs130class;

import java.util.Scanner;

public class lab7q2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Employee Menu\nEnter Employee Number:\n100 - General Manager\n200 - Supervisor\n300 - Staff\n400 - Contractor");
		
		int emp = scan.nextInt();
		
		System.out.println("Enter your first and last name!");
		
		String name = scan.next(); 
		
		
		switch (emp) {
		
		case 100:
			System.out.println("Welcome, General Manager" + name);
			break;
		
		case 200:
			System.out.println("Weclome, Supervisor " + name);
			break;
		case 300:
			System.out.println("Welcome, Staff Member " + name);
			break;
		case 400:
			System.out.println("Welcome, Contractor " + name);
			break;
		default:
			System.out.println("Invalid");
			break;
		}
		

	}

}
