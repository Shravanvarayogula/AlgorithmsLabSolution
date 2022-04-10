package com.labsession.algorithms01;
/**
 * 
 * @author shravan varayogula
 * @category: algorithms Lab Session
 * @see: algorithms Lab Session Question-01 
 */
class DailyTargetChecking {
	protected static void checkDailyTarget(int transaction[], int target) {
		boolean check =false;;
		int n = transaction.length;
		int i;
		int cumsum = 0;
		for (i=0;i<n;i++) {
			cumsum += transaction[i];
			if (cumsum >= target) {
				check = true;	
				break;
			}
		}
		if(check == true) {
			System.out.println("Target "+target+" is acheived after "+ (i+1)+" transactions");
		}
		else if (check == false){
			System.out.println("Given target "+target+ " was not acheived ");
		}
		
	}
}
