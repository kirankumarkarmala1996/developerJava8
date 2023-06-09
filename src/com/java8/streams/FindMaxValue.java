package com.java8.streams;

import java.util.Arrays;
import java.util.List;

public class FindMaxValue {
	public static void main(String[] args) {
		int[]arr= new int[]{1,2,3,4,5,6,7,8,9};
//		int[] arr = new int[] { 25, 11, 7, 75, 56 };		
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) 
				max=arr[i];
				
			}
			System.out.println(" maximum number = "+max);
		
	int min =arr[0];
	for(int num:arr) {
		if(min>num);
	}
	System.out.println(" minimum number = "+min);
		
		
		
		
		
	}

	
	

}
