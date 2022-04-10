package com.labsession.algorithms02;
import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,denomination_size, pay;
		int [] currency_denominations;
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("Enter the size of currency denominations");
			denomination_size = input.nextInt();
			currency_denominations = new int[denomination_size];
			System.out.println("Enter the currency denominations value");
			for(i=0;i<denomination_size;i++) {
				currency_denominations[i] = input.nextInt();
			}
			System.out.println("Enter the amount you want to pay");
			pay = input.nextInt();
			input.close();
			// Merge sort the denominations
			int low =0,high = currency_denominations.length-1;
			Denominations sort = new Denominations();
			sort.performMergesortonDenomination(currency_denominations,low,high);
			int [] count = new int[denomination_size];
			for(i=0;i <= denomination_size-1;i++) {
				int temp = pay/currency_denominations[i];
				pay = pay - (temp*currency_denominations[i]);
				count[i] = temp;
			}
			
			if(pay != 0) {
				System.out.println("Your payment cannot be made");
			}
			else {
				for(int j=0;j<denomination_size;j++) {
					if(count[j]>0)
					System.out.println(currency_denominations[j]+":" +count[j]);
				}
			}
		}
		catch (java.util.InputMismatchException e) {
			System.out.println("Please enter only Integer Denominations");
		}
		
		
	}

}
