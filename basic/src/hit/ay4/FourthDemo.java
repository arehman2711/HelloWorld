package hit.ay4;

import java.util.Scanner;

public class FourthDemo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter The Value Lesser Than 10...:");
		
		int x=scan.nextInt();
		
		if(x>10) {
			System.out.println("You Entered...:"+x);
			System.out.println("Please Enter The Lesser Value Than 10...");
		}
		else {
			System.out.println("Counguragulations...You have enter the right valu...");
		}
}
}
