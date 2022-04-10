package com.labsession.algorithms02;
/**
 * 
 * @author: shravan varayogula
 * @category: algorithms Lab Session
 * @see:  algorithms Lab Session Question-02 
 *
 */
public class Denominations {
	//Sort denominations in descending order
		public static void mergeDenominations(int[] a, int left, int mid,int right) {
			int firstsubarraylength = mid-left+1;
			int rightsubarraylength = right-mid;
			int[] firstsubarray= new int[firstsubarraylength];
			int[] secondsubarray = new int[rightsubarraylength];
			for(int i=0; i< firstsubarraylength;i++ ){
				firstsubarray[i]= a[left+i];
			}
			for (int i = 0; i < rightsubarraylength; i++) {
				secondsubarray[i]=a[mid+1+i];
			}
			
			int i,j,k;
			i=0;
			j=0;
			k=left;

			while(i< firstsubarraylength && j< rightsubarraylength) {
				if( firstsubarray[i] >= secondsubarray[j] ) {
					a[k]=firstsubarray[i];
					i++;k++;
				}
				else {
					a[k]=secondsubarray[j];
					j++;
					k++;
				}
			}
				while(i< firstsubarraylength) {
					a[k] = firstsubarray[i];
					i++;k++;
				}
				while(j < rightsubarraylength) {
					a[k]= secondsubarray[j];
					j++;
					k++;
				}
		}
		public void performMergesortonDenomination(int a[],int left, int right) {
 			if (left < right) {
			int mid = (left+right)/2;
  			performMergesortonDenomination(a,left,mid);
 			performMergesortonDenomination(a,mid+1,right);
  			mergeDenominations(a,left,mid,right);
			}
 		}
	
	
}
