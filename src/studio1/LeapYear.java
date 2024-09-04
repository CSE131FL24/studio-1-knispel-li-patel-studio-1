package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Year: ");
		int year = in.nextInt();
		double divByFour = year % 4;
		double divByHund = year % 100;
		double excpt = year % 400;
		boolean isLeapYear = (divByFour == 0 && divByHund != 0) || (excpt == 0);
		System.out.println(year + " is " + isLeapYear + " for being a leap year!");
	}

}
