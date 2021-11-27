package replit_uygulamalari_method_array;

public class Method_Array_02 {

	public static void main(String[] args) {
		// Write a Java program that reverse a sentence by using Array 
		//(with all spaces and special characters).

		//Input : Coding is greate.

		//Output : .etaerg si gnidoC
		String cumle="Coding is greate.";
		String arr[]=cumle.split("");
		System.out.print("Output : ");		
		for (int i =arr.length-1 ; i >=0 ; i--) {
			System.out.print(arr[i]);
		}
	}

}
