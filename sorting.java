package com.kn.array;

public class sorting {
 public void sortingArrayAcending (int[]arr){
	 boolean swapping =false;
	 int temp=0;
	 for(int i=0;i<arr.length-1;i++)
	 {
		 for(int j=0;j<arr.length-1-i;j++)
		 {
			 if (arr[j]<arr[j+1])
					 {
				       temp=arr[j+1];
				       arr[j+1]=arr[j];
				       arr[j]=temp;
				        }
					swapping=true;
			 
		 }
		 if(swapping==false)
		 {
			break;
			}
		}
	 System.out.println("the array elements after sorting=");
		for(int i=0;i<arr.length;i++) 
		{
			
			System.out.println(arr[i]);
		}
		 
		 
	 
 }
}
