package com.akb;

import java.util.Arrays;

public class SelectionSorting {

	public void selectionSort(int[] arr) {
		int l = arr.length-1;
		for(int i=0;i<=l;i++) {
			int minIndex=-1;
			int temp;
			for(int j=i;j<=l;j++) {
				minIndex=i;
				if(arr[j]<arr[minIndex]) {
					minIndex=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr= {4,8,2,9,10,1,7};
		SelectionSorting ss = new SelectionSorting();
		System.out.println(Arrays.toString(arr));
		ss.selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
