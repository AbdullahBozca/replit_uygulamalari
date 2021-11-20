package replit_uygulamalari_loops;

import java.util.Iterator;
import java.util.Scanner;

public class For_while_09 {

	public static void main(String[] args) {
		// Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. 

			Scanner scan=new Scanner(System.in);
			System.out.println("Bir sayı giriniz: ");
			String sayi=scan.next();
			String ters="";
			
			for (int i = sayi.length()-1; i >= 0; i--) {
				ters+=sayi.charAt(i);
			}
			System.out.println(ters);
	}

}
