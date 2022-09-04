package calculater;

import java.util.Scanner;

public class MyCal {
	public static void main (String []args) {
		try (Scanner scan = new Scanner (System.in)) {
			double fnum, snum;
			String operation;
			System.out.print("Enter first number: ");
			fnum = scan.nextDouble();
			System.out.print("Enter seconed number: ");
			snum = scan.nextDouble();
			System.out.print("Choose the operation ( + , - , * , /): ");
			operation = scan.next();
			switch(operation) {
				case "+":System.out.print(snum+fnum);
				break;
				case "/":System.out.print(fnum/snum);
				break;
				case "-":System.out.print(fnum-snum);
				break;
				case "*":System.out.print(snum*fnum);
				break;
			}
			System.out.print("Final result of calculation");
		}
	}
}
