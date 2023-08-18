package com.kn.array;

import java.util.Scanner;

public class bubbleSortDemo {

	public static void main(String[] args) {
		Scanner Scan= new Scanner (System.in);
		System.out.println("enter the length of an array");
		
		//array creation and declaration 
		int[]arr=new int [Scan.nextInt()];
		
		//initialization
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter the elements " +(i+1)+ "=");
			arr[i]=Scan.nextInt();
			
			
		}
		//object creation and declaration 
		BubbleSort sort=new BubbleSort();
		sort.bubble(arr);
		
		
        System.out.println("after sorting");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
	}

}

