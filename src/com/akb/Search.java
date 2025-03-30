package com.akb;

public class Search {

	public int linearSearch(int[] arr,int target) {
		int steps=0;
		for(int i=0;i<arr.length;i++) {
			steps++;
			if(arr[i]==target) {
				System.out.println("Numbers of steps taken by Linear Search: "+steps);
				return i;
			}
		}
		
		return -1;	
	}
	
	public int binarySearch(int[] arr, int target) {
		int steps=0;
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			steps++;
			int mid=(low+high)/2;
			if(arr[mid]==target) {
				System.out.println("Number of Steps taken by Binary Search: "+steps);
				return mid;
			}
			else if(arr[mid]<target)
				low=mid+1;
			else
				high=mid-1;
		}
		return -1;
	}
	
	public int binarySearchByRec(int[] arr, int target, int low, int high) {
		int steps=0;
		if(low<=high) {
			steps++;
			int mid=(low+high)/2;
			if(arr[mid]==target) {
				System.out.println("Number of steps taken by binary search using Recurssion: "+steps);
				return mid;
			}
			else if(arr[mid]<target)
				return binarySearchByRec(arr, target, mid+1, high);
			else
				return binarySearchByRec(arr, target, low, mid-1);
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int[] arr1= {1,7,4,5,6};
		int[] arr2 = {2,4,6,8,10,12,14,16,20,28,32,44,85};
		int target =20;
		Search search = new Search();
		int index1=search.linearSearch(arr1, target);
		int index2=search.binarySearch(arr2, target);
		int index3=search.binarySearchByRec(arr2, target, 0, arr2.length-1);
		System.out.println("Number found at index: "+index1);
		System.out.println("Number found at index: "+index2);
		System.out.println("Number found at index: "+index3);
		
	}
}
