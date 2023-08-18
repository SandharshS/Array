package com.kn.array;

import java.util.Scanner;

public class DifferenceOfArray 
{

	public static void main(String[] args) 
	{
		Scanner Scan=new Scanner (System.in);
		System.out.println("enter the length of an array");
		int[]arr=new int[Scan.nextInt()];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter the elements "+(i+1));
			arr[i]=Scan.nextInt();
		}
		DifferenceOfArrayDemo  sub = new DifferenceOfArrayDemo ();
		sub.DiffOfArray(arr);
		
		}


		
	}

		
	


