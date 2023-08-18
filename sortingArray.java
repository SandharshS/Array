package com.kn.array;

import java.util.Scanner;

public class sortingArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[]arr= {2,1,5,6,8,10};
//		int arr[]=new int [5];
	
//		//array initialization
//		for(int i=0;i<arr.length;i++) {
//			System.out.println("enter the array elements=");
//			arr[i]=scan.nextInt();
//		}
	
//		//array before sorting
		System.out.println("the array elements before sorting=");
	    for(int i=0;i<arr.length;i++) {
		
		System.out.println(arr[i]+" ");
		}
		
		
		
		sorting sort=new sorting();
		sort.sortingArrayAcending(arr);
		
		
		

	}

}
