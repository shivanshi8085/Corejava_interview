package com.rays.javabasic;

public class Exercies18 {
	public static void main(String[] args) {

		int[] arr = { 32, 515, 634, 26, 65, 6, 56, 4, 4, 65, 65 };
		int num = 6;

		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				temp = i;
			}
		}
		System.out.println(temp);
	}

}