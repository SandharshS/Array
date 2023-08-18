package com.kn.array;

import java.util.Scanner;

public class ForwardTraversingApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length");
		int[] arr = new int[scan.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter the elements" + (i + 1));
			arr[i] = scan.nextInt();

		}
		ForwardTraversing forwd = new ForwardTraversing();

		forwd.forward(arr);
		forwd.backward(arr);

	}

}
