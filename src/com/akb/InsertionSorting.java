package com.akb;

public class InsertionSorting {

	public void insertionSort(int[] arr) {
		int l=arr.length-1;
		for(int i=1;i<=l;i++) {
			int j=i-1;
			int key=arr[i];
			while(j>=0 && arr[j]>key) {	
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr= {8,64,9,7,6,2,4,1};
		
		InsertionSorting is = new InsertionSorting();
		for(int num:arr) {
			System.out.print(num+" ");
		}
		System.out.println();
		is.insertionSort(arr);
		for(int num:arr) {
			System.out.print(num+" ");
		}
	}
}
