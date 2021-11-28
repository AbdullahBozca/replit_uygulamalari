package replit_uygulamalari_list;

import java.util.Scanner;



public class List_03 {

	public static void main(String[] args) {
		// Get a sentence from the user. Accept the sentence received from the user as a parameter, Invert sentence using Array and write a Method that returns the result as a String to the main method.

		//Note: Upper and lower case letters, spaces and special characters will not be changed.

		//Input :

		//It is very nice to write code.

		//Output :

		//.edoc etirw ot ecin yrev si tI
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir cümle giriniz: ");
		String cumle=scan.nextLine();
		String tersString=	ters(cumle);
		System.out.println(tersString);

	}

	private static String ters(String cumle) {
		String arr[]=cumle.split("");
		String tersCumle="";
		for (int i = arr.length-1; i >=0; i--) {
			tersCumle+=arr[i];
		}
		return tersCumle;
	}

}
