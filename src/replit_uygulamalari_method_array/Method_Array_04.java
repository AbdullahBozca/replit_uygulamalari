package replit_uygulamalari_method_array;

import java.util.Arrays;

public class Method_Array_04 {

	public static void main(String[] args) {
		// Create a custom return type method accepts a name as parameter and prints the
		// name as a char array.

//		(do not use toCharArray() method)

//		Input : John

//		Output :[J, o, h, n]

		String kelime="J	ohn";
		String arr[]=arr(kelime);
		System.out.println("Output :"+Arrays.toString(arr));
	}

	private static String[] arr(String kelime) {
		String arr[]=kelime.split("");
		return arr;
	}

	

}
