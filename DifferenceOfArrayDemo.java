package com.kn.array;

public class DifferenceOfArrayDemo {
	public void DiffOfArray(int[] arr) 
	{
		int sub=0;
		for(int i=0;i<arr.length;i++)
		{
			sub=sub-arr[i];
			
		}
		System.out.println(sub);
	}

}