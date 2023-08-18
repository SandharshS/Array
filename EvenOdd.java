package com.kn.array;

public class EvenOdd 
{
	public void evenOddNum (int[]arr) {
	
		int even=0;
		int odd=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]%2==0) 
		{
			even=even+1;
			
		}
		else
		{
			odd=odd+1;
		}
	}
		System.out.println("even"+even+"odd"+odd);
	}
	

}
