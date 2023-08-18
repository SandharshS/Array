package com.kn.array;

public class ForwardTraversing 
{
	public void forward(int[] arr) 
	{
		for (int i = 0; i < arr.length; i++) 
		{

			System.out.println(arr[i]);
		}
	}

	public void backward(int[] arr)
	{
		System.out.println();
		for (int i = arr.length-1; i >=0; i--) 
		{

			System.out.println(arr[i]);
		}
	}
}
