package com.akb;

import java.util.Arrays;

public class BubbleSorting {

	public void bubbleSort(int[] arr) {
		int l =arr.length-1;
		for(int i=0;i<l;i++) {
			for(int j=0;j<=l-i-1;j++) {
				int temp=0;
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr= {2,7,29,9,6,1,4,3};
		BubbleSorting bs = new BubbleSorting();
		System.out.println(Arrays.toString(arr));
		bs.bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
