package com.kn.array;

public class BubbleSort {
 public int[]  bubble (int[]arr) 
 {
	 int temp=0;
	 for(int i=0;i<arr.length;i++)
	 {
		 boolean swapped=false;
	 for(int j=0;j<arr.length-1-i;j++)
	 {
		 if(arr[j]>arr[j+1])
		 {
			 temp=arr[j];
			 arr[j]=arr[j+1];
			 arr[j+1]=temp;
			 swapped=true;
		 }
		 
	 }
	 if(swapped==false)
	 {
		 break;
	 }
		 
	 }
	 return arr;
	 
	 
	 
	 
 }
}
