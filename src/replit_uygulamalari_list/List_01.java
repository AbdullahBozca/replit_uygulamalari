package replit_uygulamalari_list;

import java.util.ArrayList;
import java.util.List;

public class List_01 {

	public static void main(String[] args) {
		// Write a Java program to get a String from user as input and
		// find the maximum occurring character in that string. (Ignore case
		// sensitivity)

		// input :

		// Learning java is easy

		// output:

		// maximum occurring character is : a

					String cumle = "Learning java is easy";
					String arr[] = cumle.split("");
					int count = 0;
					int enCok = 0;
					char enCokHarf = ' ';
					for (int i = 0; i < arr.length; i++) {
						for (int j = 0; j < arr.length; j++) {
							if (arr[i].contains(arr[j])) {
								count++;
							}
			
						}
						if (count > enCok) {
							enCok = count;
							enCokHarf = arr[i].charAt(0);
						}
						count = 0;
					}
					System.out.println("maximum occurring character is : "+enCokHarf);
		}

}
