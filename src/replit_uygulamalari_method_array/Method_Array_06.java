package replit_uygulamalari_method_array;

import java.util.Arrays;

public class Method_Array_06 {

	public static void main(String[] args) {
		// Write a method that accepts an integer array as input and prints the minimum
		// and the maximum numbers from given array

		// Input : {3,2,5,4,1,6}

		// Output :

		// min: 1

		// max: 6
		int arr[] = { 3, 2, 5, 4, 1, 6 };
		bul(arr);

	}

	private static void bul(int[] arr) {

		Arrays.sort(arr);
		System.out.println("min: " + arr[0]);
		System.out.println("max: " + arr[arr.length - 1]);

	}

}
