package replit_uygulamalari_method_array;

import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.Iterator;

public class Method_Array_01 {

	public static void main(String[] args) {
		// Write a return method to reverse number.

		//Input : 12345

		//Output : 54321
		String sayi="12345";
		ters(sayi);

	}

	public static void ters(String sayi) {
		// TODO Auto-generated method stub
		String terString="";
		for (int i = sayi.length() - 1; i >= 0; i--) {
			terString+=sayi.charAt(i);
			}
		System.out.println("Output : "+terString);

	}

}


