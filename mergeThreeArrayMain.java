package com.kn.array;

import java.util.Scanner;

public class mergeThreeArrayMain {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("enter the 1st array length");
		int[]arr=new int [scan.nextInt()];
		System.out.println("enter the 2nd array length");
		int[]brr=new int [scan.nextInt()];
		System.out.println("enter the 3rd array length ");
		int[]crr=new int [scan.nextInt()];

	    for(int i=0;i<arr.length;i++)
	    {
	    	System.out.println("enter the 1st array element"+(i+1));
	    	arr[i] = scan.nextInt();
	    }
	    	
	    for(int i=0;i<brr.length;i++) 
	    {
	    	System.out.println("enter the 2nd array elements"+(i+1));
	    	brr[i]=scan.nextInt();
	    }
	    for(int i=0;i<crr.length;i++) {
	    	System.out.println("enter the 3rd array element"+(i+1));
	    
	    	crr[i]=scan.nextInt();
	    }
	    int[]drr= main(arr,brr,crr);
	    
	  }

	public static int[] main(int[] arr, int[] brr, int[] crr) {
		int[]drr=new int []
		return null;
	}
	
	
	
	

}
