package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.println("Enter n1: ");
		double n1 = in.nextDouble();
		System.out.println("Enter n2: ");
		double n2 = in.nextDouble();
		double sum = n1 + n2;
		double average = sum/2;
		System.out.println("Average of n1 + n2 = " + average);
	}

}
