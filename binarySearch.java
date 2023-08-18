package com.kn.array;

public class binarySearch {
	public void binarySearchElement(int[] arr) {

		int mid = 0;
		int l=0;
		int h=arr.length;
		int element=60;
		int a = 0;
		 while (l <= h) {
			
			mid = (l + h) / 2;

			if (element == arr[mid]) {
				a=1;
				break;
			}

			else if (element >= arr[mid]) {
				l = mid + 1;
			}

			else {
				h = mid - 1;
			}

		}
		 if (a==1) {
			 System.out.println("element found");
			
		}else {
			System.out.println("element not found");
		}

	}

	

}
