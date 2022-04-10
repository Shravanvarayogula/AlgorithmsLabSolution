package com.labsession.algorithms01;
import java.util.Scanner;

public class DriverClass extends DailyTargetChecking {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		try {
		System.out.println("Enter the size of transaction array:");
		int size = input.nextInt();
		int transactionarray[] = new int[size];
		System.out.println("Enter the values of array\r\n");
		for (int i=0;i<size;i++) {
			transactionarray[i] = input.nextInt();
		}	
		System.out.println("Enter the total no of targets that needs to be achieved");
		int targetcount = input.nextInt();
		
		while(targetcount > 0) {
			System.out.println("Enter the value of target");
			int target = input.nextInt();
			checkDailyTarget(transactionarray,target);
			targetcount--;
			System.out.println();
		}
		input.close();
		}
		catch (java.util.InputMismatchException e) {
			System.out.println("Please enter only Integer values");
		}
		

	}
}
