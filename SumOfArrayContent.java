package com.kn.array;

public class SumOfArrayContent {

	public void calculateMulOfArray(int[] arr) 
	{
		int mul = 1;
		for (int i = 0; i < arr.length; i++) 
		{
			mul = mul * arr[i];
		}
		System.out.println(mul);
	}

	public void calculateSumOfArray(int[] arr) 
	{
		int sum = 0;

		for (int i = 0; i < arr.length; i++) 
		{
			sum = sum + arr[i];
		}
		System.out.println(sum);
	}

}
