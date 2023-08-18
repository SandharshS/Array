package com.kn.array;

import java.util.Scanner;

public class SumOfArrayContentApp 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the length of an array");
		int[] arr = new int[scanner.nextInt()];

		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println("enter the elements " + (i + 1));
			arr[i] = scanner.nextInt();
		}
		SumOfArrayContent sum = new SumOfArrayContent();

		sum.calculateSumOfArray(arr);

		sum.calculateMulOfArray(arr);
	}

}
