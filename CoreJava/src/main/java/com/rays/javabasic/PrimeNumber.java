package com.rays.javabasic;

public class PrimeNumber {
	public static void main(String[] args) {

		int n = 17;
		int count = 0;

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("yes");

		} else {
			System.out.println("No");
		}
	}
}
